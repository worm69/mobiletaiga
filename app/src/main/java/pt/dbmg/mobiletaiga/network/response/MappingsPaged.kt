package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MappingsPaged(
    @SerializedName("data")
    val `data`: List<DataMappings>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)