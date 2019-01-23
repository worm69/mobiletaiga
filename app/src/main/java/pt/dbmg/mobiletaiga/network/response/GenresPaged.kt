package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GenresPaged(
    @SerializedName("data")
    val `data`: List<DataGenres>,
    @SerializedName("links")
    val links: Links2,
    @SerializedName("meta")
    val meta: Meta
)