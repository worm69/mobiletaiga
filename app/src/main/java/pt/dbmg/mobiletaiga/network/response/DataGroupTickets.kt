package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupTickets(
    @SerializedName("attributes")
    val attributes: AttributesGroupTickets,
    @SerializedName("id")
    val id: String, // 41
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupTickets,
    @SerializedName("type")
    val type: String // groupTickets
)