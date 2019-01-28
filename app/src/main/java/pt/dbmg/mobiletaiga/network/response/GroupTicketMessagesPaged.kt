package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupTicketMessagesPaged(
    @SerializedName("data")
    val `data`: List<DataGroupTicketMessages>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)