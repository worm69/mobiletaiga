package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserProfileLinkSites(
    @SerializedName("data")
    val `data`: List<DataUserProfileLinkSites>
)