package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("animeCharacters")
    val animeCharacters: Anime,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductionsX,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaff,
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("episodes")
    val episodes: Episodes,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("installments")
    val installments: Installments,
    @SerializedName("mappings")
    val mappings: Mappings,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships,
    @SerializedName("reviews")
    val reviews: Review,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks
)