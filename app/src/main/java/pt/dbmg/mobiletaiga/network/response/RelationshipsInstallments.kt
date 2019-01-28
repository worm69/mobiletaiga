package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsInstallments(
    @SerializedName("franchise")
    val franchise: Franchise
)