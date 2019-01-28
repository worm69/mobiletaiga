package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import java.util.Date

open class Item(
    var animeId: Int = 0,
    var episode: Int = 0,
    var time: Date? = null
) : RealmObject()