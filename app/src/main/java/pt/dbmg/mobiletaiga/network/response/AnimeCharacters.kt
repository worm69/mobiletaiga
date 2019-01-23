package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AnimeCharacters(
    @SerializedName("data")
    val `data`: DataAnimeCharacters
)