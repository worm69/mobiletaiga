package pt.dbmg.mobiletaiga.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import pt.dbmg.mobiletaiga.App
import pt.dbmg.mobiletaiga.databinding.UsersFragmentBinding
import pt.dbmg.mobiletaiga.viewmodel.data.UsersList
import timber.log.Timber
import java.net.ConnectException
import java.net.UnknownHostException

class UsersListFragment : MvvmFragment() {
    private lateinit var binding: UsersFragmentBinding
    val userListViewModel = App.injectUserListViewModel()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = UsersFragmentBinding.inflate(inflater, container, false)
        return binding.root
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
            binding.usersList.adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, data.users) }
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
