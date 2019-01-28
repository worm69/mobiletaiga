package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MangaStaff(
    @SerializedName("data")
    val `data`: List<DataMangaStaff>
)