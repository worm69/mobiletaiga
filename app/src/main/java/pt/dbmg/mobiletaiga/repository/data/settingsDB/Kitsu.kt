package pt.dbmg.mobiletaiga.repository.data.settingsDB

import io.realm.RealmObject

open class Kitsu(
    var displayname: String = "", // worm69
    var email: String = "", // wormdaniel_69@hotmail.com
    var username: String = "", // worm69
    var password: String = "", // V29yY5IyFLaXRzdQ==
//    var partiallibrary: String = "", // true
    var ratingsystem: String = "", // simple
    var accessToken: String ="",
    var createdAt: Int = 0, // 1518235801
    var expiresIn: Int = 0, // 2591963
    var refreshToken: String = "" // 123abc
) : RealmObject()