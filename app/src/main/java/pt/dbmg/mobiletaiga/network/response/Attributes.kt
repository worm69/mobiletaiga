package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: CreatedAt,
    @SerializedName("role")
    val role: String, // supporting
    @SerializedName("updatedAt")
    val updatedAt: UpdatedAt
)