package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataXXXXXXXXXXXXXXXX(
    @SerializedName("attributes")
    val attributes: AttributesXXXXXXXXXXX,
    @SerializedName("id")
    val id: String, // 1911
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsXXXXXXXXXXXXXXX,
    @SerializedName("type")
    val type: String // linkedAccounts
)