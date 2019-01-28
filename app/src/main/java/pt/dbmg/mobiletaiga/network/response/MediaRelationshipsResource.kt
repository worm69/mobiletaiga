package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaRelationshipsResource(
    @SerializedName("data")
    val `data`: List<DataMediaRelationships>
)