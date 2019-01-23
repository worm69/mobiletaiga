package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaReactionVotesPaged(
    @SerializedName("data")
    val `data`: List<DataMediaReactionVotes>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)