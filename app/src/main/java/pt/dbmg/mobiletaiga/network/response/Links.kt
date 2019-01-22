package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("related")
    val related: String, // https://kitsu.io/api/edge/manga-characters/1/manga
    @SerializedName("self")
    val self: String // https://kitsu.io/api/edge/manga-characters/1/relationships/manga
)