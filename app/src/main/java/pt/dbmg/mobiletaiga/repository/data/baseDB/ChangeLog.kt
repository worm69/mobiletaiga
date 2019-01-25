package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject

/**
 *Created by E818 on 25/01/2019
 */
open class ChangeLog(
    var version: String,
    var fix: String
) : RealmObject()