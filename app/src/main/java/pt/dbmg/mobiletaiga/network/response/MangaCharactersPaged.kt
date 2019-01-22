package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MangaCharactersPaged(
    @SerializedName("data")
    val `data`: List<DataXXXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta

)