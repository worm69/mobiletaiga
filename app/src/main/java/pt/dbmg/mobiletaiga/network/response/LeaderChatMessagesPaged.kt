package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class LeaderChatMessagesPaged(
    @SerializedName("data")
    val `data`: List<DataLeaderChatMessages>
)