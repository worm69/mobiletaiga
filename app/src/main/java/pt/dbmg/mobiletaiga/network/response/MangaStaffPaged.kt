package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MangaStaffPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)