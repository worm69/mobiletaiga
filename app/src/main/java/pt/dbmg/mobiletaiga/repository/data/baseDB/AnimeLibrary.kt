package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class AnimeLibrary(
    @PrimaryKey open var id: String, // 3
    var library_id: String, // 29880287
    var progress: String, // 0
    var date_start: String, // 0000-00-00
    var date_end: String, // 0000-00-00
    var score: String, // 0
    var status: String, // 5
    var rewatched_times: String, // 0
    var rewatching: String, // 0
    var rewatching_ep: String, // 0
    var tags: String,
    var notes: String,
    var last_updated: String// 1529692418
) : RealmObject()