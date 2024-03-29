package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataProducers(
    @SerializedName("attributes")
    val attributes: AttributesProducers,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsProducers,
    @SerializedName("type")
    val type: String // producers
)