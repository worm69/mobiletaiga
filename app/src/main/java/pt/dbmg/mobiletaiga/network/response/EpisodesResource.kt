package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class EpisodesResource(
    @SerializedName("data")
    val `data`: List<DataEpisodes>
)