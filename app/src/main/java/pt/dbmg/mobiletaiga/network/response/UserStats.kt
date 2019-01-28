package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserStats(
    @SerializedName("data")
    val `data`: List<DataUserStats>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)