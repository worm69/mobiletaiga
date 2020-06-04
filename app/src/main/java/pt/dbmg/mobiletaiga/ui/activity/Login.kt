package pt.dbmg.mobiletaiga.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.annotations.RealmModule
import kotlinx.android.synthetic.main.activity_login.et_password
import kotlinx.android.synthetic.main.activity_login.et_user
import kotlinx.android.synthetic.main.activity_login.sp_service
import pt.dbmg.anilistclient.LoginAnilistActivity
import pt.dbmg.mobiletaiga.BuildConfig
import pt.dbmg.mobiletaiga.MainActivity
import pt.dbmg.mobiletaiga.network.response.KitsuToken
import pt.dbmg.mobiletaiga.repository.api.ApiKitsu
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Anilist
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Kitsu
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Myanimelist
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Settings
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Update
import pt.dbmg.mobiletaiga.ui.dialog.LoginSkipAccountLinkDialog
import pt.dbmg.mobiletaiga.util.SecurityUtils
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import java.io.File
import java.security.SecureRandom
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import io.realm.RealmResults

class Login : AppCompatActivity() {
    private val SECOND_ACTIVITY_REQUEST_CODE = 111
    private var disposable: Disposable? =null
    companion object {
        private lateinit var retrofit: Retrofit
        private lateinit var kitsuApi: ApiKitsu
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(pt.dbmg.mobiletaiga.R.layout.activity_login)
//        Crashlytics.getInstance().crash() // Force a crash

        sp_service?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if ( position == 0 || position == 2) {
                    et_user.visibility = View.GONE
                    et_password.visibility = View.GONE
                } else {
                    et_user.visibility = View.VISIBLE
                    et_password.visibility = View.VISIBLE
                }
            }
        }
        val key = ByteArray(64)
        SecureRandom().nextBytes(key)

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .name("mobile-taiga.realm")
            .deleteRealmIfMigrationNeeded() //colocar quando se mudar a estrutura da db
            .addModule(SettingsDB())    //modulo com informações para encryptar
//            .encryptionKey(key) //Encryp db
            .schemaVersion(0)
            .build()
        when {
            File(realmConfig.path).exists() -> Timber.d(this.toString(), " Realm DB Exist")
            else -> Timber.d(this.toString(), " Realm DB dont Exist")
        }
        Realm.setDefaultConfiguration(realmConfig)
        Timber.i( SecurityUtils.bytesToHex(key))


        val realm = Realm.getDefaultInstance()
        val realmKitsuTokens : Kitsu? = realm.where(Kitsu::class.java).findFirst()
        val realmAnilistTokens : Anilist? = realm.where(Anilist::class.java).findFirst()
        if(realmKitsuTokens!=null ||realmAnilistTokens!=null){
            goMainActivity()
        }


    }


    fun doLogin(view: View?) {
        if (view?.id == pt.dbmg.mobiletaiga.R.id.btn_login) {
            //TODO check selected service
            when (sp_service.selectedItem) {
                "Select" -> showWarningPopUp()
                "Kitsu" -> getKitsuCredencials()
                "Anilist" -> getAnimistCredentials()

            }
            //warning  dialog
        }
    }

    private fun getAnimistCredentials() {
        val intent = Intent(this, LoginAnilistActivity::class.java)
        startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE)
    }

    // This method is called when the second activity finishes
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Check that it is the SecondActivity with an OK result
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                // Get String data from Intent
                val token = data!!.getStringExtra("token")
                val tokenExpires = data!!.getStringExtra("tokenExpires")
                val refreshToken = data!!.getStringExtra("refreshToken")

                Timber.d( "$token $tokenExpires $refreshToken")
                val realm = Realm.getDefaultInstance()
                realm.beginTransaction()
                realm.insert(Anilist("test", "POINT_10", token, tokenExpires, refreshToken))
                realm.insertOrUpdate(Update("Anilist","false"))
                realm.commitTransaction()
                realm.close()
                goMainActivity()
            }
        }

    }

    private fun showWarningPopUp() {
        LoginSkipAccountLinkDialog.newInstance(this)
            .showDialog()
    }

    private fun getKitsuCredencials() {

        retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BuildConfig.KITSUURL)
            .build()

        kitsuApi = retrofit.create(ApiKitsu::class.java)

        getTokenKitsu(kitsuApi)
    }

    private fun getTokenKitsu(apiKitsu: ApiKitsu) {
        val user = et_user.editableText.toString()
        val password= et_password.editableText.toString()
        if (user.isNotBlank() && password.isNotBlank()) {
            apiKitsu.getToken("password", user, password)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<KitsuToken> {
                    override fun onSubscribe(d: Disposable) {
                        disposable = d
                    }

                    override fun onError(e: Throwable) {
                        Timber.d( e.toString())
                    }

                    override fun onNext(data: KitsuToken) {
                        Timber.d( "${data.accessToken} ${data.createdAt} ${data.expiresIn}")
                        val realm = Realm.getDefaultInstance()
                        realm.beginTransaction()
                        realm.insert(Kitsu(user,user,user,password, "simple", data.accessToken,data.createdAt, data.expiresIn, data.refreshToken))
                        realm.insertOrUpdate(Update("Kitsu","false"))
                        realm.commitTransaction()
                        realm.close()
                    }

                    override fun onComplete() {
    //                    isLoading.set(false)
                        goMainActivity()
                    }
                })
        }else{
            et_user.error = "Empety"
            et_password.error = "Empety"
        }
    }

    private fun goMainActivity() {
        val intent = Intent(this@Login, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }

    @RealmModule(classes = [Anilist::class, Kitsu::class, Myanimelist::class, Settings::class, Update::class])
    class SettingsDB

    override fun onDestroy() {
        super.onDestroy()
        disposable?.dispose()
    }

    fun doSkip(view: View) { goMainActivity()}
}

