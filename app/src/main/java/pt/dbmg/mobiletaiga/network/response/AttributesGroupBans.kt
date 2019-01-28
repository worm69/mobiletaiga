package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesGroupBans(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-03-12T16:40:59.662Z
    @SerializedName("notes")
    val notes: Any, // null
    @SerializedName("notesFormatted")
    val notesFormatted: Any, // null
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-03-12T16:40:59.662Z
)