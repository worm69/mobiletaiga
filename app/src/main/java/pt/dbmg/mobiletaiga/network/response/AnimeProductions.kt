package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AnimeProductions(
    @SerializedName("data")
    val `data`: DataAnimeProductions
)