package pt.dbmg.mobiletaiga.repository.data.settingsDB

import io.realm.RealmObject

open class Settings(
    var update: Update? = null,
    var myanimelist: Myanimelist? = null,
    var kitsu: Kitsu? = null,
    var anilist: Anilist? = null
) : RealmObject()