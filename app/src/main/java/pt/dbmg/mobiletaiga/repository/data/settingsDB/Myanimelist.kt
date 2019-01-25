package pt.dbmg.mobiletaiga.repository.data.settingsDB

import io.realm.RealmObject

open class Myanimelist(
    var login: String, // 1
    var username: String,
    var password: String
) : RealmObject()