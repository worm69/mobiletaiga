package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupTicketMessages(
    @SerializedName("ticket")
    val ticket: Ticket,
    @SerializedName("user")
    val user: User
)