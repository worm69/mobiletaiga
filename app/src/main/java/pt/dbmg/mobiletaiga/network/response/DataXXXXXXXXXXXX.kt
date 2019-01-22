package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXX,
    @SerializedName("id")
    val id: String, // 2
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // siteAnnouncements
)