package pt.dbmg.mobiletaiga.repository.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Single
import pt.dbmg.mobiletaiga.network.response.DataAnime

@Dao
interface AnimeDao {

    @Query("SELECT * FROM anime")
    fun getAnimes(): Single<List<DataAnime>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(anime: DataAnime)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(anime: List<DataAnime>)
}