package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupsPaged(
    @SerializedName("data")
    val `data`: List<DataGroups>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)