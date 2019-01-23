package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)