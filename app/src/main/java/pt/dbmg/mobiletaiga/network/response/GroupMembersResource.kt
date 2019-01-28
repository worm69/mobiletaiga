package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupMembersResource(
    @SerializedName("data")
    val `data`: List<DataGroupMembers>
)