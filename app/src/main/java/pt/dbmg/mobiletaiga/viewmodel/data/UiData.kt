package pt.dbmg.mobiletaiga.viewmodel.data

import pt.dbmg.mobiletaiga.repository.data.User

data class UsersList(val users: List<User>, val message: String, val error: Throwable? = null)
