package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Application(
    @SerializedName("uid")
    val uid: String
)