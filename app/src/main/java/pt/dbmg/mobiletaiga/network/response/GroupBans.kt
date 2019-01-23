package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupBans(
    @SerializedName("data")
    val `data`: List<DataGroupBans>
)