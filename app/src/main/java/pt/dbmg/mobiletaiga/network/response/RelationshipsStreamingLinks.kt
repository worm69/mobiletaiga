package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsStreamingLinks(
    @SerializedName("media")
    val media: MediaX,
    @SerializedName("streamer")
    val streamer: Streamer
)