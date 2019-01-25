package pt.dbmg.mobiletaiga.repository.data.settingsDB

import io.realm.RealmObject

open class Settings(
    var update: Update,
    var myanimelist: Myanimelist,
    var kitsu: Kitsu,
    var anilist: Anilist
) : RealmObject()