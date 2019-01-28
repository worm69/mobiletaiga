package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ImageX(
    @SerializedName("large")
    val large: String, // https://media.kitsu.io/categories/images/10/large.jpg?1496212711
    @SerializedName("medium")
    val medium: String, // https://media.kitsu.io/categories/images/10/medium.jpg?1496212711
    @SerializedName("meta")
    val meta: MetaX,
    @SerializedName("original")
    val original: String, // https://media.kitsu.io/categories/images/10/original.jpg?1496212711
    @SerializedName("small")
    val small: String, // https://media.kitsu.io/categories/images/10/small.jpg?1496212711
    @SerializedName("tiny")
    val tiny: String // https://media.kitsu.io/categories/images/10/tiny.jpg?1496212711
)