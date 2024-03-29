package pt.dbmg.mobiletaiga.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.maddog05.maddogutilities.callback.Callback
import pt.dbmg.mobiletaiga.R
import pt.dbmg.mobiletaiga.ui.fragment.SettingsFragment
import pt.dbmg.mobiletaiga.util.C

class SettingsActivity : AppCompatActivity() {

    private val modifiedSettings = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container_settings,
            SettingsFragment.newInstance(Callback { modifiedValue ->
                modifiedSettings.add(modifiedValue)
            }))
        transaction.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            onBackPressed()
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val bundle = Bundle()
        setResult(if (modifiedSettings.isNotEmpty()) {
            for (i in 0 until modifiedSettings.size) {
                if (modifiedSettings[i] == C.SETTING_MODIFIED_CLEAR_DATABASE)
                    bundle.putBoolean(C.Extras.SETTING_CHANGE_CLEAR_HISTORY, true)
            }
            Activity.RESULT_OK
        } else {
            Activity.RESULT_CANCELED
        })
        intent!!.putExtras(bundle)
        super.onBackPressed()
    }
}