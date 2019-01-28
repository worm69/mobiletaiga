package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MappingsResource(
    @SerializedName("data")
    val `data`: List<DataMappings>
)