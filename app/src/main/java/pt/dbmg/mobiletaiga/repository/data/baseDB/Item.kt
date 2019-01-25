package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import java.util.Date

open class Item(
    var animeId: Int,
    var episode: Int,
    var time: Date
) : RealmObject()