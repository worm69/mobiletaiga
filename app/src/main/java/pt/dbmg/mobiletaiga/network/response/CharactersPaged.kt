package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class CharactersPaged(
    @SerializedName("data")
    val `data`: List<DataXXX>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)