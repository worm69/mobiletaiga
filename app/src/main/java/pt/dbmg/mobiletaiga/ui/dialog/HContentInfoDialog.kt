package pt.dbmg.mobiletaiga.ui.dialog

import android.app.Dialog
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatImageButton
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import pt.dbmg.mobiletaiga.R

class HContentInfoDialog : DialogFragment() {
    companion object {
        @JvmStatic
        fun newInstance(activity: AppCompatActivity, listener: OnAcceptedListener): HContentInfoDialog {
            val dialog = HContentInfoDialog()
            dialog.activity = activity
            dialog.listener = listener
            return dialog
        }
    }

    private lateinit var listener: OnAcceptedListener
    private lateinit var activity: AppCompatActivity
    private lateinit var acceptChk: AppCompatCheckBox
    private lateinit var acceptBtn: AppCompatButton
    private var isAccepted = false

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
            val ft = manager?.beginTransaction()
            ft?.add(this, tag)
            ft?.commitAllowingStateLoss()
        } catch (ignored: IllegalStateException) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_h_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val closeBtn: AppCompatImageButton = view.findViewById(R.id.btn_close_h_content)
        closeBtn.setOnClickListener { dismiss() }
        acceptChk = view.findViewById(R.id.chk_h_content)
        acceptBtn = view.findViewById(R.id.btn_accept_h_content)
        acceptChk.isChecked = isAccepted
        acceptChk.setOnCheckedChangeListener { _, isChecked ->
            this.isAccepted = isChecked
        }
        acceptBtn.setOnClickListener {
            listener.isAccepted(this.isAccepted)
            dismiss()
        }
    }

    fun setIsAccepted(isAccepted: Boolean): HContentInfoDialog {
        this.isAccepted = isAccepted
        return this
    }

    fun showDialog() {
        show(activity.supportFragmentManager, "quotaInfoDialog")
    }

    interface OnAcceptedListener {
        fun isAccepted(isAccepted: Boolean)
    }
}