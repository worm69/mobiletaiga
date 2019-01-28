package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupMemberNotesResource(
    @SerializedName("data")
    val `data`: List<DataGroupMemberNotes>
)