package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXXXXXXXXXXXXXXXXXXXXXXXXX(
    @SerializedName("libraryEntry")
    val libraryEntry: LibraryEntry,
    @SerializedName("media")
    val media: Media,
    @SerializedName("user")
    val user: User
)