package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupInvitesResource(
    @SerializedName("data")
    val `data`: List<DataGroupInvites>
)