package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsMediaAttributeVotes(
    @SerializedName("animeMediaAttribute")
    val animeMediaAttribute: AnimeMediaAttribute,
    @SerializedName("dramasMediaAttribute")
    val dramasMediaAttribute: DramasMediaAttribute,
    @SerializedName("mangaMediaAttribute")
    val mangaMediaAttribute: MangaMediaAttribute,
    @SerializedName("user")
    val user: User
)