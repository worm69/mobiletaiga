package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataSiteAnnouncements(
    @SerializedName("attributes")
    val attributes: AttributesSiteAnnouncements,
    @SerializedName("id")
    val id: String, // 2
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsUserStats,
    @SerializedName("type")
    val type: String // siteAnnouncements
)