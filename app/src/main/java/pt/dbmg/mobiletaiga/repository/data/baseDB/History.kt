package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmList
import io.realm.RealmObject

open class History(
    var items: RealmList<Item> = RealmList()
) : RealmObject()