package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsGroupNeighbors(
    @SerializedName("destination")
    val destination: Destination,
    @SerializedName("source")
    val source: Source
)