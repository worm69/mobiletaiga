package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsMangaStaff(
    @SerializedName("manga")
    val manga: Manga,
    @SerializedName("person")
    val person: Person
)