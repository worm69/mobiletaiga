package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserUserRolesPaged(
    @SerializedName("data")
    val `data`: List<DataUserUserRoles>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)