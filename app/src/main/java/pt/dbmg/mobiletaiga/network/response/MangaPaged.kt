package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MangaPaged(
    @SerializedName("data")
    val `data`: List<DataManga>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)