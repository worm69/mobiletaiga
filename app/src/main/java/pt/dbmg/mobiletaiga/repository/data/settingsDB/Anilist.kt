package pt.dbmg.mobiletaiga.repository.data.settingsDB

import io.realm.RealmObject

open class Anilist(
    var username: String = "",
    var ratingsystem: String = "", // POINT_10
    var token: String = "",
    var tokenExpires: String = "",
    var refreshToken: String = ""
) : RealmObject()