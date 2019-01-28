package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaAttributesPaged(
    @SerializedName("data")
    val `data`: List<DataMediaAttributes>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)