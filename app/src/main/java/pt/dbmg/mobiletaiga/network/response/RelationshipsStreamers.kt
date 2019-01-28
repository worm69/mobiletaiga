package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsStreamers(
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks,
    @SerializedName("videos")
    val videos: Videos
)