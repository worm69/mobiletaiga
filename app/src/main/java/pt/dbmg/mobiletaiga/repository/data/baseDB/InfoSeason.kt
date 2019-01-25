package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class InfoSeason(
    @PrimaryKey open var name: String, // Fall 2011
    var modified: Int // 1380254460
) : RealmObject()