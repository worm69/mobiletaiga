package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class FranchisesResource(
    @SerializedName("data")
    val `data`: List<DataFranchises>
)