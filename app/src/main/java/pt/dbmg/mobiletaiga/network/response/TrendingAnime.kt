package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class TrendingAnime(
    @SerializedName("data")
    val `data`: List<DataTrendingAnime>
)