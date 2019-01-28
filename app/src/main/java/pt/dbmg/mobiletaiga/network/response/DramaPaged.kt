package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DramaPaged(
    @SerializedName("data")
    val `data`: List<DataDrama>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)