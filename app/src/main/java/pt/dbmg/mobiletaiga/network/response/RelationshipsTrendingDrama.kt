package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsTrendingDrama(
    @SerializedName("castings")
    val castings: CastingsX,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("dramaCharacters")
    val dramaCharacters: DramaCharacters,
    @SerializedName("dramaStaff")
    val dramaStaff: DramaStaff,
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