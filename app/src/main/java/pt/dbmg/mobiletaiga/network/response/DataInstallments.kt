package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class DataInstallments(
    @SerializedName("attributes")
    val attributes: AttributesInstallments,
    @SerializedName("id")
    val id: String, // 1
    @SerializedName("links")
    val links: Links1,
    @SerializedName("relationships")
    val relationships: RelationshipsInstallments,
    @SerializedName("type")
    val type: String // installments
)