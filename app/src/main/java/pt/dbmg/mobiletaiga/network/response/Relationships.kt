package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("castings")
    val castings: CastingsRelationships,
    @SerializedName("character")
    val character: Character
)