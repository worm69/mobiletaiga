package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class InstallmentsPaged(
    @SerializedName("data")
    val `data`: List<DataInstallments>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)