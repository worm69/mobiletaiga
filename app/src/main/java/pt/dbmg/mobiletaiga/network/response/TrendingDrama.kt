package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class TrendingDrama(
    @SerializedName("data")
    val `data`: List<DataTrendingDrama>
)