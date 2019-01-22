package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesXXXXXXXXXXXXXXXXXXX(
    @SerializedName("actionPerformed")
    val actionPerformed: String, // update
    @SerializedName("createdAt")
    val createdAt: String, // 2017-09-23T00:00:37.565Z
    @SerializedName("errorMessage")
    val errorMessage: Any, // null
    @SerializedName("progress")
    val progress: Int, // 8
    @SerializedName("rating")
    val rating: Int, // 14
    @SerializedName("reconsumeCount")
    val reconsumeCount: Int, // 0
    @SerializedName("reconsuming")
    val reconsuming: Boolean, // false
    @SerializedName("status")
    val status: String, // current
    @SerializedName("syncStatus")
    val syncStatus: String, // success
    @SerializedName("updatedAt")
    val updatedAt: String, // 2017-09-23T00:00:38.677Z
    @SerializedName("volumesOwned")
    val volumesOwned: Int // 0
)