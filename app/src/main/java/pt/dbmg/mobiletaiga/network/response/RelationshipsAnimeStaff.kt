package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsAnimeStaff(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("person")
    val person: Person
)