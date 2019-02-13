package pt.dbmg.mobiletaiga.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_login.et_password
import kotlinx.android.synthetic.main.activity_login.et_user
import kotlinx.android.synthetic.main.activity_login.sp_service
import pt.dbmg.anilistclient.LoginAnilistActivity
import pt.dbmg.mobiletaiga.repository.data.settingsDB.Anilist

class Login : AppCompatActivity() {
    private val SECOND_ACTIVITY_REQUEST_CODE = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(pt.dbmg.mobiletaiga.R.layout.activity_login)
        sp_service?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position == 2) {
                    et_user.visibility = View.GONE
                    et_password.visibility = View.GONE
                } else {
                    et_user.visibility = View.VISIBLE
                    et_password.visibility = View.VISIBLE
                }
            }
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
            //get token
            //store values
        }
    }

    private fun getAnimistCredentials() {
        val intent = Intent(this, LoginAnilistActivity::class.java)
//        intent.putExtra("token", "");
//        setResult(Activity.RESULT_OK, intent);
          startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE);
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

                Log.d("Login Success", "$token $tokenExpires $refreshToken")
                Realm.init(this);
                val realm = Realm.getDefaultInstance()
                realm.beginTransaction()
                realm.insert(Anilist("test", "POINT_10", token, tokenExpires, refreshToken))
                realm.commitTransaction()
                realm.close()
            }
        }
    }


    private fun showWarningPopUp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun getKitsuCredencials() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
