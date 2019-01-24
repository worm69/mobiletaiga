package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupTicketMessages(
    @SerializedName("attributes")
    val attributes: AttributesGroupTicketMessages,
    @SerializedName("id")
    val id: String, // 89
    @SerializedName("links")
    val links: Links2,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupTicketMessages,
    @SerializedName("type")
    val type: String // groupTicketMessages
)