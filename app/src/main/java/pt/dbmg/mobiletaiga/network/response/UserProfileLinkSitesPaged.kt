package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserProfileLinkSitesPaged(
    @SerializedName("data")
    val `data`: List<DataUserProfileLinkSites>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)