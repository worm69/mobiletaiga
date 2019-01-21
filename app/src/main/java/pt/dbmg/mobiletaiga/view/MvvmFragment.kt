package pt.dbmg.mobiletaiga.view

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class MvvmFragment : androidx.fragment.app.Fragment() {

    val subscriptions = CompositeDisposable()

    fun subscribe(disposable: Disposable): Disposable {
        subscriptions.add(disposable)
        return disposable
    }

    override fun onStop() {
        super.onStop()
        subscriptions.clear()
    }
}
