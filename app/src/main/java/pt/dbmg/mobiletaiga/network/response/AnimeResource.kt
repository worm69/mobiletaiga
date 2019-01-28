package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AnimeResource(
    @SerializedName("data")
    val `data`: List<DataAnime>
)