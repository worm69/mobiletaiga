package pt.dbmg.mobiletaiga.repository

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import pt.dbmg.mobiletaiga.network.response.DataAnime
import pt.dbmg.mobiletaiga.repository.api.ApiKitsu
import pt.dbmg.mobiletaiga.repository.db.AnimeDao
import timber.log.Timber

class AnimeRepository(val animeApi: ApiKitsu, val AnimeDao: AnimeDao) {

    fun getAnimes(
        season: String,
        seasonYear: Int,
        streamers: String,
        ageRating: String
    ): Observable<List<DataAnime>> {
        return Observable.concatArray(
            getAnimesFromDb(season, seasonYear, streamers, ageRating),
            getAnimesFromApi(season, seasonYear, streamers, ageRating)
        )
    }

    fun getAnimesFromDb(
        season: String,
        seasonYear: Int,
        streamers: String,
        ageRating: String
    ): Observable<List<DataAnime>> {
        return AnimeDao.getAnimes().filter { it.isNotEmpty() }
            .toObservable()
            .doOnNext {
                Timber.d("Dispatching ${it.size} anime from DB...")
            }
    }

    fun getAnimesFromApi(
        season: String,
        seasonYear: Int,
        streamers: String,
        ageRating: String
    ): Observable<List<DataAnime>> {
        return animeApi.getAnimeCollection(season, seasonYear, streamers, ageRating).flatMap { list ->
            Observable.fromIterable(storeAnimesInDb(list.data)).toList().toObservable()
        }
    }

    fun storeAnimesInDb(animes: List<DataAnime>): List<DataAnime> {
        Observable.fromCallable { AnimeDao.insertAll(animes) }
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .subscribe {
                Timber.d("Inserted ${animes.size} anime from API in DB...")
            }
        return animes
    }
}