package pt.dbmg.mobiletaiga.repository.data.settingsDB

import io.realm.RealmObject

open class Update(
    var activeservice: String = "", // kitsu
    var asktoconfirm: String = "" // false
) : RealmObject()