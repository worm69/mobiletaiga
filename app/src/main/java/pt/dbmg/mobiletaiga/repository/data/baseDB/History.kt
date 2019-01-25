package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject

open class History(
    var items: List<Item>
) : RealmObject()