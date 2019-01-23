package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaFollowsResource(
    @SerializedName("data")
    val `data`: List<DataMediaFollows>
)