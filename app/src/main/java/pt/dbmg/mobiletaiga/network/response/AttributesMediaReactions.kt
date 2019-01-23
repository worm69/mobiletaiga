package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesMediaReactions(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-25T09:40:43.455Z
    @SerializedName("reaction")
    val reaction: String, // A well-crafted story of paradoxical pain and suffering. Not as painful however as the slow pace of chapter releases.
    @SerializedName("upVotesCount")
    val upVotesCount: Int, // 4
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-25T09:40:43.455Z
)