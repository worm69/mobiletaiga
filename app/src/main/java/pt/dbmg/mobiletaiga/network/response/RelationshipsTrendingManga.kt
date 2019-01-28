package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsTrendingManga(
    @SerializedName("castings")
    val castings: CastingsX,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("chapters")
    val chapters: Chapters,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("installments")
    val installments: Installments,
    @SerializedName("mangaCharacters")
    val mangaCharacters: Manga,
    @SerializedName("mangaStaff")
    val mangaStaff: MangaStaffX,
    @SerializedName("mappings")
    val mappings: Mappings,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships,
    @SerializedName("reviews")
    val reviews: Review
)