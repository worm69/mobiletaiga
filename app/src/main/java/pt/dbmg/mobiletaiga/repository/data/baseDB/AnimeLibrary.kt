package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class AnimeLibrary(
    @PrimaryKey open var id: Int = 0, // 3
    var library_id: String = "", // 29880287
    var progress: Int = 0, // 0
    var date_start: String = "", // 0000-00-00
    var date_end: String = "", // 0000-00-00
    var score: Int = 0, // 0
    var status: Int = 0, // 5
    var rewatched_times: Int = 0, // 0
    var rewatching: Int = 0, // 0
    var rewatching_ep: Int = 0, // 0
    var tags: String = "",
    var notes: String = "",
    var last_updated: Int = 0// 1529692418
) : RealmObject()