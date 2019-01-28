package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("original")
    val original: String // https://media.kitsu.io/characters/images/1/original.jpg?1483096805
)