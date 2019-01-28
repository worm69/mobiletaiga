package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsPeople(
    @SerializedName("castings")
    val castings: CastingsRelationships
)