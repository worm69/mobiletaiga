package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class PostPaged(
    @SerializedName("data")
    val `data`: List<DataPost>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)