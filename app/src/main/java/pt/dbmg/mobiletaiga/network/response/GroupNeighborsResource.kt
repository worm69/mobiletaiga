package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupNeighborsResource(
    @SerializedName("data")
    val `data`: List<DataGroupNeighbors>
)