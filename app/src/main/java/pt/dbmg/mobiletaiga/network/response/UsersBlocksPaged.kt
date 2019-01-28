package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UsersBlocksPaged(
    @SerializedName("data")
    val `data`: List<DataUsersBlocks>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)