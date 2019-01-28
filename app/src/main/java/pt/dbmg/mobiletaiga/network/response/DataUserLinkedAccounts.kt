package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataUserLinkedAccounts(
    @SerializedName("attributes")
    val attributes: AttributesUserLinkedAccounts,
    @SerializedName("id")
    val id: String, // 1911
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsUserLinkedAccounts,
    @SerializedName("type")
    val type: String // linkedAccounts
)