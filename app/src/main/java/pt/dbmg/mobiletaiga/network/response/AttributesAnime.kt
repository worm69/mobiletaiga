package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesAnime(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>,
    @SerializedName("ageRating")
    val ageRating: String, // R
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String, // 17+ (violence & profanity)
    @SerializedName("averageRating")
    val averageRating: String, // 88.55
    @SerializedName("canonicalTitle")
    val canonicalTitle: String, // Cowboy Bebop
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int, // 400
    @SerializedName("createdAt")
    val createdAt: String, // 2013-02-20T16:00:13.609Z
    @SerializedName("endDate")
    val endDate: String, // 1999-04-24
    @SerializedName("episodeCount")
    val episodeCount: Int, // 26
    @SerializedName("episodeLength")
    val episodeLength: Int, // 25
    @SerializedName("favoritesCount")
    val favoritesCount: Int, // 3485
    @SerializedName("nsfw")
    val nsfw: Boolean, // false
    @SerializedName("popularityRank")
    val popularityRank: Int, // 10
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies,
    @SerializedName("ratingRank")
    val ratingRank: Int, // 10
    @SerializedName("showType")
    val showType: String, // TV
    @SerializedName("slug")
    val slug: String, // cowboy-bebop
    @SerializedName("startDate")
    val startDate: String, // 1998-04-03
    @SerializedName("status")
    val status: String, // finished
    @SerializedName("subtype")
    val subtype: String, // TV
    @SerializedName("synopsis")
    val synopsis: String, // In the year 2071, humanity has colonoized several of the planets and moons...
    @SerializedName("tba")
    val tba: String,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-12-20T00:00:09.270Z
    @SerializedName("userCount")
    val userCount: Int, // 43409
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String // qig4KOK2R2g
)