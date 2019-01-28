package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupReportsPaged(
    @SerializedName("data")
    val `data`: List<DataGroupReports>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)