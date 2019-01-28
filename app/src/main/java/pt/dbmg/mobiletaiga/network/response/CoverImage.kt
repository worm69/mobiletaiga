package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CoverImage(
    @SerializedName("large")
    val large: String, // https://media.kitsu.io/anime/cover_images/1/large.jpg?1416336000
    @SerializedName("meta")
    val meta: MetaX,
    @SerializedName("original")
    val original: String, // https://media.kitsu.io/anime/cover_images/1/original.jpg?1416336000
    @SerializedName("small")
    val small: String, // https://media.kitsu.io/anime/cover_images/1/small.jpg?1416336000
    @SerializedName("tiny")
    val tiny: String // https://media.kitsu.io/anime/cover_images/1/tiny.jpg?1416336000
)