package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("meta")
    val meta: MetaX,
    @SerializedName("original")
    val original: String // https://media.kitsu.io/chapters/thumbnails/403830/original.jpg?1501195665
)