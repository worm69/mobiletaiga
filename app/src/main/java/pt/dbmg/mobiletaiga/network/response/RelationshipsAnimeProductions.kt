package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsAnimeProductions(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("producer")
    val producer: Producer
)