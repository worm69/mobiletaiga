package pt.dbmg.mobiletaiga.repository.api

import io.reactivex.Observable
import pt.dbmg.mobiletaiga.repository.data.User
import retrofit2.http.GET

interface UserApi {

    @GET("6de6abfedb24f889e0b5f675edc50deb?fmt=raw&sole")
    fun getUsers(): Observable<List<User>>
}
