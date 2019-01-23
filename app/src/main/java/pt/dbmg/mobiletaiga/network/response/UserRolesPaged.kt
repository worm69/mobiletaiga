package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserRolesPaged(
    @SerializedName("data")
    val `data`: List<DataUserRolesPaged>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)