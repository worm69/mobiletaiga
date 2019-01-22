package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CastingsPaged(
    @SerializedName("data")
    val `data`: List<DataX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)