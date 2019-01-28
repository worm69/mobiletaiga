package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserBlocksError(
    @SerializedName("errors")
    val errors: List<Error>
)