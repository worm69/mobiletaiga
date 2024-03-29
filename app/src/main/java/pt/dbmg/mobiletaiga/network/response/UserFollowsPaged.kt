package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserFollowsPaged(
    @SerializedName("data")
    val `data`: List<DataUserFollows>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)