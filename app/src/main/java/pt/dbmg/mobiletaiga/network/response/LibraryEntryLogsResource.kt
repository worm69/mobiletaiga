package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class LibraryEntryLogsResource(
    @SerializedName("data")
    val `data`: List<DataXXXXXXXXXXXXXXXXXXXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)