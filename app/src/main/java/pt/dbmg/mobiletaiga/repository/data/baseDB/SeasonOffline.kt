package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class SeasonOffline(
    @PrimaryKey open var id: Int,
    var anime: AnimeSeason,
    var info: InfoSeason
) : RealmObject()