package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupReportsResource(
    @SerializedName("data")
    val `data`: List<DataGroupReports>
)