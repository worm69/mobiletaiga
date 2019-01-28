package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsMediaRelationships(
    @SerializedName("destination")
    val destination: Destination,
    @SerializedName("source")
    val source: Source
)