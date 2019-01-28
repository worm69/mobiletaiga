package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ChangedData(
    @SerializedName("started_at")
    val startedAt: List<String>,
    @SerializedName("status")
    val status: List<String>,
    @SerializedName("updated_at")
    val updatedAt: List<String>
)