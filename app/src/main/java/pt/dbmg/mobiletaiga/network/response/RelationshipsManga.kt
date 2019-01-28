package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsManga(
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("chapters")
    val chapters: Chapters,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("installments")
    val installments: Installments,
    @SerializedName("mangaCharacters")
    val mangaCharacters: MangaCharacters,
    @SerializedName("mangaStaff")
    val mangaStaff: MangaStaff,
    @SerializedName("mappings")
    val mappings: Mappings,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships,
    @SerializedName("reviews")
    val reviews: Review
)