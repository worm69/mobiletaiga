package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class ProducersPaged(
    @SerializedName("data")
    val `data`: List<DataProducers>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)