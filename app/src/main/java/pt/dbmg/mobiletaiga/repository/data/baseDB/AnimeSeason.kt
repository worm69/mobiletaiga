package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class AnimeSeason(
    @PrimaryKey open var idMyanimelist: Int, // 10624
    var image: String, // https://myanimelist.cdn-dena.com/images/anime/11/29197.jpg
    var producers: String, // Starchild Records, GoHands, Sentai Filmworks
    var title: String, // Mardock Scramble: The Second Combustion
    var type: Int // 3
) : RealmObject()