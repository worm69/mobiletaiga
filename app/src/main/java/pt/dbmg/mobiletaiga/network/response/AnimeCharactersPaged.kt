package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AnimeCharactersPaged(
    @SerializedName("data")
    val `data`: List<DataAnimeCharacters>,
    @SerializedName("links")
    val links: Links3,
    @SerializedName("meta")
    val meta: Meta
)