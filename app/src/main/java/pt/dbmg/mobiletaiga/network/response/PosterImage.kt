package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class PosterImage(
    @SerializedName("large")
    val large: String, // https://media.kitsu.io/anime/poster_images/1/large.jpg?1431697256
    @SerializedName("medium")
    val medium: String, // https://media.kitsu.io/anime/poster_images/1/medium.jpg?1431697256
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("original")
    val original: String, // https://media.kitsu.io/anime/poster_images/1/original.jpg?1431697256
    @SerializedName("small")
    val small: String, // https://media.kitsu.io/anime/poster_images/1/small.jpg?1431697256
    @SerializedName("tiny")
    val tiny: String // https://media.kitsu.io/anime/poster_images/1/tiny.jpg?1431697256
)