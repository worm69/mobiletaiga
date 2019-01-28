package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsLibraryEvents(
    @SerializedName("anime")
    val anime: Anime,
    @SerializedName("drama")
    val drama: Drama,
    @SerializedName("libraryEntry")
    val libraryEntry: LibraryEntry,
    @SerializedName("manga")
    val manga: Manga,
    @SerializedName("user")
    val user: User
)