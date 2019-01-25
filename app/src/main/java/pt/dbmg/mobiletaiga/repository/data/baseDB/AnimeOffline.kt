package pt.dbmg.mobiletaiga.repository.data.baseDB

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class AnimeOffline(
    @PrimaryKey open var idtaiga: Int, // 48
    var idkitsu: Int, // 48
    var source: String, // kitsu
    var slug: String, // basilisk-kouga-ninpou-chou
    var title: String, // Basilisk: Kouga Ninpou Chou
    var english: String, // Basilisk
    var japanese: String, // バジリスク 甲賀忍法帖
    var type: Int, // 1
    var status: Int, // 1
    var episodeCount: String, // 24
    var episodeLength: String, // 24
    var dateStart: String, // 2005-04-13
    var dateEnd: String,
    var image: String, // https://media.kitsu.io/anime/poster_images/48/small.jpg?1507942062
    var ageRating: String,
    var score: String, // 7.4329999999999998
    var popularity: String, // 1020
    var synopsis: String, // The heirs to the Kouga and Iga ninja clans, Gennosuke and Oboro, hoped the unsteady truce between their tribes would last—but fate denies the lovers, thrusting their people into war after centuries of peace. The terms are set on two scrolls. One bears a list of Kouga warriors. The other holds a list of those who fight for Iga. The names found on these scrolls can only be crossed out in blood.(Source: Funimation)
    var modified: String // 1548419001
) : RealmObject()