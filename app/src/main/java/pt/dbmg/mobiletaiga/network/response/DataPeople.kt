package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataPeople(
    @SerializedName("attributes")
    val attributes: AttributesPeople,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsPeople,
    @SerializedName("type")
    val type: String // people
)