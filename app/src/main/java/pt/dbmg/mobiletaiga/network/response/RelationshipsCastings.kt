package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsCastings(
    @SerializedName("character")
    val character: CharacterLink,
    @SerializedName("media")
    val media: Media,
    @SerializedName("person")
    val person: Person
)