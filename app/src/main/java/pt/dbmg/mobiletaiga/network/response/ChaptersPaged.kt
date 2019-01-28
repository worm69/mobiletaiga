package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ChaptersPaged(
    @SerializedName("data")
    val `data`: List<DataChapters>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)