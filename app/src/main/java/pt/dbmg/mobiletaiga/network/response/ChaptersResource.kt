package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ChaptersResource(
    @SerializedName("data")
    val `data`: List<DataChapters>
)