package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsChapters(
    @SerializedName("manga")
    val manga: Manga
)