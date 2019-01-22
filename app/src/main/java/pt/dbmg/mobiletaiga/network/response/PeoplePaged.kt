package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class PeoplePaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)