package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class InstallmentsResource(
    @SerializedName("data")
    val `data`: List<DataInstallments>
)