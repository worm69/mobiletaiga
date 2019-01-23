package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUserProfileLinks(
    @SerializedName("profileLinkSite")
    val profileLinkSite: ProfileLinkSite,
    @SerializedName("user")
    val user: User
)