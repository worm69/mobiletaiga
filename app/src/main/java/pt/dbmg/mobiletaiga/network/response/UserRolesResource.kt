package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserRolesResource(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)