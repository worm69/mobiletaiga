package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsMediaAttributes(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("drama")
    val drama: Drama,
    @SerializedName("manga")
    val manga: Manga
)