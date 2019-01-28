package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupMembersPaged(
    @SerializedName("data")
    val `data`: List<DataGroupMembers>
)