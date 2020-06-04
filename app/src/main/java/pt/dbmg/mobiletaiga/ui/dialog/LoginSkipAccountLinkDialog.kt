package pt.dbmg.mobiletaiga.ui.dialog

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import pt.dbmg.anilistclient.LoginAnilistActivity
import pt.dbmg.mobiletaiga.MainActivity
import pt.dbmg.mobiletaiga.R

/**
 *Created by E818 on 15/02/2019
 */
class LoginSkipAccountLinkDialog: DialogFragment() {

    private lateinit var activity: AppCompatActivity
    private lateinit var closeBtn: AppCompatImageButton
    private lateinit var yesBtn: AppCompatButton
    private lateinit var noBtn: AppCompatButton

    private lateinit var titleTv: AppCompatTextView
    private lateinit var descriptionTv: AppCompatTextView

    companion object {
        @JvmStatic
        fun newInstance(activity: AppCompatActivity): LoginSkipAccountLinkDialog {
            val dialog = LoginSkipAccountLinkDialog()
            dialog.activity = activity
            return dialog
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun show(manager: FragmentManager, tag: String?) {
        try {
            val ft = manager.beginTransaction()
            ft.add(this, tag)
            ft.commitAllowingStateLoss()
        } catch (ignored: IllegalStateException) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.dialog_skip_login, container, false)
        titleTv = root.findViewById(R.id.tv_title_changelog)
        descriptionTv = root.findViewById(R.id.tv_description_changelog)
        closeBtn = root.findViewById(R.id.btn_close_changelog)
        closeBtn.setOnClickListener { dismiss() }

        yesBtn = root.findViewById(R.id.yesBtnDialog)
        yesBtn.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        noBtn = root.findViewById(R.id.noBtnDialog)
        noBtn.setOnClickListener { dismiss() }

        return root
    }

    fun showDialog() {
        show(activity.supportFragmentManager, "LoginSkipAccountLinkDialog")
    }
}