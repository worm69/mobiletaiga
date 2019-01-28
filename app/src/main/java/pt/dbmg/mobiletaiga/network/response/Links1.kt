package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Links1(
    @SerializedName("self")
    val self: String // https://kitsu.io/api/edge/anime-staff/1
)