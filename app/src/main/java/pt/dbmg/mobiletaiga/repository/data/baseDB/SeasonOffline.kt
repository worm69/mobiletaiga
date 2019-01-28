package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class SeasonOffline(
    @PrimaryKey open var id: Int = 0,
    var anime: AnimeSeason? = null,
    var info: InfoSeason? = null
) : RealmObject()