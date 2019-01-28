package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsLibraryEntries(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("drama")
    val drama: Drama,
    @SerializedName("manga")
    val manga: Manga,
    @SerializedName("media")
    val media: Media,
    @SerializedName("mediaReaction")
    val mediaReaction: MediaReaction,
    @SerializedName("nextUnit")
    val nextUnit: NextUnit,
    @SerializedName("review")
    val review: Review,
    @SerializedName("unit")
    val unit: Unit,
    @SerializedName("user")
    val user: User
)