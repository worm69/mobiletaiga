package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUserProfileLinkSites(
    @SerializedName("attributes")
    val attributes: AttributesUserProfileLinkSites,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("type")
    val type: String // profileLinkSites
)