package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class LibraryEventsPaged(
    @SerializedName("data")
    val `data`: List<DataLibraryEvents>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)