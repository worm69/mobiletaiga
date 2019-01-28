package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Links2(
    @SerializedName("related")
    val related: String, // https://kitsu.io/api/edge/anime-characters/10/castings
    @SerializedName("self")
    val self: String // https://kitsu.io/api/edge/anime-characters/10/relationships/castings
)