package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class SiteAnnouncementsPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)