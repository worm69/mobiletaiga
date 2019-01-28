package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class SiteAnnouncements(
    @SerializedName("data")
    val `data`: List<DataSiteAnnouncements>
)