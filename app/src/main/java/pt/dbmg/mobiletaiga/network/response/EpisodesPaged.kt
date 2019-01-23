package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class EpisodesPaged(
    @SerializedName("data")
    val `data`: List<DataEpisodes>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)