package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupNeighborsPaged(
    @SerializedName("data")
    val `data`: List<DataGroupNeighbors>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)