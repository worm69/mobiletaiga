package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupTicketMessagesResource(
    @SerializedName("data")
    val `data`: List<DataGroupTicketMessages>
)