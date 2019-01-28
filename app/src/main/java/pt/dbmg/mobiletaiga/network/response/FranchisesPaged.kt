package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class FranchisesPaged(
    @SerializedName("data")
    val `data`: List<DataFranchises>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)