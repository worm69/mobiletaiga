package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Castings(
    @SerializedName("data")
    val `data`: List<DataX>
)