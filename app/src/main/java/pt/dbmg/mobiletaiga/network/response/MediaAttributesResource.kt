package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaAttributesResource(
    @SerializedName("data")
    val `data`: List<DataMediaAttributes>
)