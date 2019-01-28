package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesManga(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: Any, // null
    @SerializedName("ageRating")
    val ageRating: String, // R
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String, // Horror
    @SerializedName("averageRating")
    val averageRating: String, // 82.47
    @SerializedName("canonicalTitle")
    val canonicalTitle: String, // Attack on Titan
    @SerializedName("chapterCount")
    val chapterCount: Any, // null
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int, // 112
    @SerializedName("createdAt")
    val createdAt: String, // 2013-12-18T13:59:39.232Z
    @SerializedName("endDate")
    val endDate: Any, // null
    @SerializedName("favoritesCount")
    val favoritesCount: Int, // 758
    @SerializedName("mangaType")
    val mangaType: String, // manga
    @SerializedName("popularityRank")
    val popularityRank: Int, // 2
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies,
    @SerializedName("ratingRank")
    val ratingRank: Int, // 138
    @SerializedName("serialization")
    val serialization: String, // Bessatsu Shounen Magazine
    @SerializedName("slug")
    val slug: String, // shingeki-no-kyojin
    @SerializedName("startDate")
    val startDate: String, // 2009-09-09
    @SerializedName("status")
    val status: String, // finished
    @SerializedName("subtype")
    val subtype: String, // manga
    @SerializedName("synopsis")
    val synopsis: String, // Several hundred years ago...
    @SerializedName("tba")
    val tba: String,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-12-24T00:00:19.819Z
    @SerializedName("userCount")
    val userCount: Int, // 7137
    @SerializedName("volumeCount")
    val volumeCount: Int // 0
)