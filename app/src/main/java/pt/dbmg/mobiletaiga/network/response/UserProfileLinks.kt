package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserProfileLinks(
    @SerializedName("data")
    val `data`: List<DataUserProfileLinks>
)