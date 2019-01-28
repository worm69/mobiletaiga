package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesDrama(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<Any>,
    @SerializedName("ageRating")
    val ageRating: String, // R
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String, // 17+ (violence & profanity)
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int, // 400
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("endDate")
    val endDate: String, // 1999-04-04
    @SerializedName("episodeCount")
    val episodeCount: Int, // 26
    @SerializedName("episodeLength")
    val episodeLength: Int, // 24
    @SerializedName("favoritesCount")
    val favoritesCount: Int, // 3277
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
    @SerializedName("slug")
    val slug: String,
    @SerializedName("startDate")
    val startDate: String, // 1998-04-03
    @SerializedName("status")
    val status: String, // finished
    @SerializedName("subtype")
    val subtype: String, // TV
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("tba")
    val tba: String,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-07-27T22:47:45.129Z
    @SerializedName("userCount")
    val userCount: Int, // 40405
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String
)