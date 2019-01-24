package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ActionLogs(
    @SerializedName("links")
    val links: Links2
)