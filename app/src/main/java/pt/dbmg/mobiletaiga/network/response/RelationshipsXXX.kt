package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXX(
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("primaryMedia")
    val primaryMedia: PrimaryMedia
)