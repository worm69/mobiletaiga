package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsFranchises(
    @SerializedName("installments")
    val installments: Installments
)