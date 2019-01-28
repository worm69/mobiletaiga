package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaAttributeVotesPaged(
    @SerializedName("data")
    val `data`: List<DataMediaAttributeVotes>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)