package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsEpisodes(
    @SerializedName("media")
    val media: MediaX,
    @SerializedName("videos")
    val videos: Videos
)