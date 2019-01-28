package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AnimeProductionsPaged(
    @SerializedName("data")
    val `data`: List<DataAnimeProductions>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)