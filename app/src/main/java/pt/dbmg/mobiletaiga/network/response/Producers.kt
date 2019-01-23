package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Producers(
    @SerializedName("data")
    val `data`: List<DataProducers>
)