package pt.dbmg.mobiletaiga

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import com.apollographql.apollo.ApolloClient
import com.crashlytics.android.Crashlytics
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import io.fabric.sdk.android.Fabric
import kotlinx.android.synthetic.main.activity_main.drawer_layout
import kotlinx.android.synthetic.main.activity_main.nav_view
import kotlinx.android.synthetic.main.app_bar_main2.nav_button_menu
import kotlinx.android.synthetic.main.app_bar_main2.nav_host_fragment
import kotlinx.android.synthetic.main.app_bar_main2.toolbar
import okhttp3.OkHttpClient
import pt.dbmg.mobiletaiga.R.layout.activity_main
import pt.dbmg.mobiletaiga.R.string
import pt.dbmg.mobiletaiga.ui.activity.SettingsActivity
import pt.dbmg.mobiletaiga.ui.fragment.SearchFragment
import java.util.logging.Logger

class MainActivity : AppCompatActivity(), HomeFragment.OnFragmentInteractionListener, NavigationView.OnNavigationItemSelectedListener, SearchFragment.OnFragmentInteractionListener  {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var client: ApolloClient
    companion object {
        val Log = Logger.getLogger(MainActivity::class.java.name)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!BuildConfig.DEBUG) {
            Fabric.with(this, Crashlytics())
        }
        setContentView(activity_main)
        setSupportActionBar(toolbar)
        nav_button_menu.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, string.navigation_drawer_open, string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.frag_container, UsersListFragment()).commit()
        }
//        client=setupApollo()
//        client.query(FindQuery    //From the auto generated class
//                .builder()
//                .id(15125)
//                .build())
//                .enqueue(object : ApolloCall.Callback<FindQuery.DataCategoryFavorites>() {
//
//                    override fun onFailure(e: ApolloException) {
//                        Log.info(e.message.toString())
//                    }
//                    override fun onResponse(response: Response<FindQuery.DataCategoryFavorites>) {
//                        Log.info(response.toString())
//                        android.util.Log.w(response.data()?.Media()?.title()?.romaji(), MainActivity::class.java.name)
//
//
////                        runOnUiThread({
////                            progress_bar.visibility = View.GONE
////                            name_text_view.text = String.format(getString(R.string.name_text),
////                                    response.data()?.repository()?.name())
////                            description_text_view.text = String.format(getString(R.string.description_text),
////                                    response.data()?.repository()?.description())
////                            forks_text_view.text = String.format(getString(R.string.fork_count_text),
////                                    response.data()?.repository()?.forkCount().toString())
////                            url_text_view.text = String.format(getString(R.string.url_count_text),
////                                    response.data()?.repository()?.url().toString())
////                        })
//                    }
//                })
    }
    override fun onSupportNavigateUp() = NavHostFragment.findNavController(nav_host_fragment).navigateUp()
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main2, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_profile -> {

            }
            R.id.nav_report_bug -> {

            }
            R.id.nav_contact_us -> {
                  val emailIntent = Intent(
                    Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", getString(R.string.dev_email), null
                    )
                )
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mobile Taiga")
                emailIntent.putExtra(Intent.EXTRA_TEXT, "")
                startActivity(Intent.createChooser(emailIntent, "Send email..."))
            }

            R.id.nav_what_anime_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivityForResult(intent, 1)
            }

            R.id.nav_app_settings -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
    private fun setupApollo(): ApolloClient {
        val BASE_URL = "https://graphql.anilist.co"
        val okHttp = OkHttpClient
                .Builder()
                .addInterceptor { chain ->
                    val original = chain.request()
                    val builder = original.newBuilder().method(original.method(),
                            original.body())
        //                builder.addHeader("Authorization"
        //                        , "Bearer " + BuildConfig.AUTH_TOKEN)
                    chain.proceed(builder.build())
                }
                .build()
        return ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttp)
                .build()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                Toast.makeText(this, "DashBoard", Toast.LENGTH_SHORT).show()
                //check current fragment before navigate
                if (NavHostFragment.findNavController(nav_host_fragment).currentDestination?.id != R.id.searchFragment) {
                    NavHostFragment.findNavController(nav_host_fragment).navigate(R.id.action_homeFragment_to_searchFragment)
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_quick_update -> {
                Toast.makeText(this, "Quick Update", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_library -> {
                Toast.makeText(this, "Library", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
