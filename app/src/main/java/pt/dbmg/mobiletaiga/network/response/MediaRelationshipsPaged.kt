package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaRelationshipsPaged(
    @SerializedName("data")
    val `data`: List<DataMediaRelationships>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)