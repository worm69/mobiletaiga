package pt.dbmg.mobiletaiga.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.users_fragment.usersList
import pt.dbmg.mobiletaiga.App
import pt.dbmg.mobiletaiga.R
import pt.dbmg.mobiletaiga.viewmodel.data.UsersList
import timber.log.Timber
import java.net.ConnectException
import java.net.UnknownHostException

class UsersListFragment : MvvmFragment() {

    val userListViewModel = App.injectUserListViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.users_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        subscribe(userListViewModel.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Timber.d("Received UIModel $it users.")
                    showUsers(it)
                }, {
                    Timber.w(it)
                    showError()
                }))
    }

    fun showUsers(data: UsersList) {
        if (data.error == null) {
            usersList.adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, data.users)
        } else if (data.error is ConnectException || data.error is UnknownHostException) {
            Timber.d("No connection, maybe inform user that data loaded from DB.")
        } else {
            showError()
        }
    }

    fun showError() {
        Toast.makeText(context, "An error occurred :(", Toast.LENGTH_SHORT).show()
    }
}
