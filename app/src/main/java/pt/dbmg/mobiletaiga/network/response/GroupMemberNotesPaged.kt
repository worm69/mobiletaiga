package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupMemberNotesPaged(
    @SerializedName("data")
    val `data`: List<DataGroupMemberNotes>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)