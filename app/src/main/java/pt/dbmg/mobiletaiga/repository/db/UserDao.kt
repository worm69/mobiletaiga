package pt.dbmg.mobiletaiga.repository.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Single
import pt.dbmg.mobiletaiga.repository.data.User

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getUsers(): Single<List<User>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(users: List<User>)
}