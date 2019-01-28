package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataGroupMemberNotes(
    @SerializedName("attributes")
    val attributes: AttributesGroupMemberNotes,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsGroupMemberNotes,
    @SerializedName("type")
    val type: String // groupMemberNotes
)