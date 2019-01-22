package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsXXXXX(
    @SerializedName("character")
    val character: CharacterLink,
    @SerializedName("manga")
    val manga: Manga
)