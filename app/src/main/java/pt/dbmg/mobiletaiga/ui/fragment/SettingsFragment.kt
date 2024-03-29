package pt.dbmg.mobiletaiga.ui.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.maddog05.maddogutilities.callback.Callback
import pt.dbmg.mobiletaiga.BuildConfig
import pt.dbmg.mobiletaiga.R
import pt.dbmg.mobiletaiga.repository.data.LogicPreferenceSharedPref
import pt.dbmg.mobiletaiga.ui.dialog.ChangelogDialog
import pt.dbmg.mobiletaiga.ui.dialog.HContentInfoDialog
import pt.dbmg.mobiletaiga.ui.tor.Navigator

class SettingsFragment : PreferenceFragmentCompat() {

    companion object {
        fun newInstance(callback: Callback<Int>): SettingsFragment {
            val fragment = SettingsFragment()
            fragment.callback = callback
            return fragment
        }
    }

    private lateinit var callback: Callback<Int>

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings_app, rootKey)
        val hContentPreference = preferenceManager.findPreference("setting_general_enable_h_content") as Preference?
        hContentPreference?.setOnPreferenceClickListener {
            if (activity != null) {
                val logicPreference = LogicPreferenceSharedPref.newInstance(activity)
                HContentInfoDialog.newInstance(activity as AppCompatActivity, object : HContentInfoDialog.OnAcceptedListener {
                    override fun isAccepted(isAccepted: Boolean) {
                        logicPreference.hContentEnabled = isAccepted
                    }
                })
                        .setIsAccepted(logicPreference.hContentEnabled)
                        .showDialog()
            }
            true
        }
        val changelogPreference = preferenceManager.findPreference("setting_general_changelog")as Preference?
        changelogPreference?.setOnPreferenceClickListener {
            ChangelogDialog.newInstance(activity as AppCompatActivity)
                    .showDialog()
            true
        }
        val reportPreference = preferenceManager.findPreference("setting_general_report_github")as Preference?
        reportPreference?.setOnPreferenceClickListener {
            Navigator.goToWebBrowser(context, getString(R.string.url_github_issues))
            true
        }
        val appDevPreference = preferenceManager.findPreference("setting_about_developer_app")as Preference?
        appDevPreference?.setOnPreferenceClickListener {
            Navigator.goToWebBrowser(context, getString(R.string.url_app_dev))
            true
        }
        val appAPIPreference = preferenceManager.findPreference("setting_about_developer_api")as Preference?
        appAPIPreference?.setOnPreferenceClickListener {
            Navigator.goToWebBrowser(context, getString(R.string.url_api_dev))
            true
        }
        val githubPreference = preferenceManager.findPreference("setting_about_github")as Preference?
        githubPreference?.setOnPreferenceClickListener {
            Navigator.goToWebBrowser(context, getString(R.string.url_github))
            true
        }
        val storePreference = preferenceManager.findPreference("setting_about_play_store")as Preference?
        storePreference?.setOnPreferenceClickListener {
            Navigator.goToWebBrowser(context, getString(R.string.url_playstore))
            true
        }
        val termsPreference = preferenceManager.findPreference("setting_about_terms")as Preference?
        termsPreference?.setOnPreferenceClickListener {
            Navigator.goToInformation(context)
            true
        }
        val appVersionPreference = preferenceManager.findPreference("setting_about_info")as Preference?
        appVersionPreference?.setSummary(BuildConfig.VERSION_NAME)
    }
}