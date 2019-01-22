package pt.dbmg.mobiletaiga.repository.api

import io.reactivex.Observable
import pt.dbmg.mobiletaiga.network.response.AnimeCharacters
import pt.dbmg.mobiletaiga.network.response.AnimeCharactersPaged
import pt.dbmg.mobiletaiga.network.response.AnimeProductions
import pt.dbmg.mobiletaiga.network.response.AnimeProductionsPaged
import pt.dbmg.mobiletaiga.network.response.AnimeStaff
import pt.dbmg.mobiletaiga.network.response.AnimeStaffPaged
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import java.util.Date

interface ApiKitsu {
    /**
     * Token
     * @param grant_type login type
     * @param username user name
     * @param password password
     */
    @POST("/api/oauth/token")
    fun getToken(@Field("grant_type") grant_type: String, @Field("username")username: String,  @Field("password")password: String)

    //region Characters & People
    @GET("/api/edge/anime-characters")
    fun getAnimeCharactersCollection(@Field("animeId") animeId: Int): Observable<AnimeCharactersPaged>

    @GET("/api/edge/anime-characters/{id}")
    fun getAnimeCharactersResource(@Path("id") id: Int): Observable<AnimeCharacters>

    @GET("/api/edge/anime-productions")
    fun getAnimeProductionsCollection(@Field("animeId") animeId: Int, @Field("producerId") producerId: Int, @Field("role") role: String): Observable<AnimeProductionsPaged>

    @GET("/api/edge/anime-productions/{id}")
    fun getAnimeProductionsResource(@Path("id") id: Int): Observable<AnimeProductions>

    @GET("/api/edge/anime-staff")
    fun getAnimeStaffCollection(): Observable<AnimeStaffPaged>

    @GET("/api/edge/anime-staff/{id}")
    fun getAnimeStaffResource(@Path("id") id: Int): Observable<AnimeStaff>

    @GET("/api/edge/castings")
    fun getCastingsCollection(@Field("anime_id")animeId: Int, @Field("manga_id")manga_Id:Int, @Field("drama_id")drama_id:Int, @Field("mediaType")mediaType:String,@Field("language")language:String, @Field("featured")featured:Boolean, @Field("isCharacter")isCharacter:Boolean)

    @GET("/api/edge/castings/{id}")
    fun getCastingsResource(@Path("id") id:Int)

    @GET("/api/edge/characters")
    fun getCharactersCollection(@Field("slug")slug: String, @Field("name")name:String)

    @GET("/api/edge/characters/{id}")
    fun getCharactersResource(@Path("id") id:Int)

    @GET("/api/edge/manga-characters")
    fun getMangaCharactersCollection(@Field("mangaId")slug: Int)

    @GET("/api/edge/manga-characters/{id}")
    fun getMangaCharactersResource(@Path("id") id:Int)

    @GET("/api/edge/manga-staff")
    fun getMangaStaffCollection(@Field("mangaId")manga_Id: Int)

    @GET("/api/edge/manga-staff/{id}")
    fun getMangaStaffResource(@Path("id") id:Int)

    @GET("/api/edge/people")
    fun getPeopleCollection(@Field("id")id: Int)

    @GET("/api/edge/people/{id}")
    fun getPeopleResource(@Path("id") id:Int)

    @GET("/api/edge/producers")
    fun getProducersCollection(@Field("slug")slug: String)

    @GET("/api/edge/producers/{id}")
    fun getProducersResource(@Path("id") id:Int)
    //endregion

    //region Groups
    @GET("/api/edge/group-action-logs")
    fun getGroupActionLogsCollection(@Field("group")group: String)

    @GET("/api/edge/group-action-logs/{id}")
    fun getGroupActionLogsResource(@Path("id") id:Int)

    @GET("/api/edge/group-bans")
    fun getGroupBansCollection(@Field("group")group: String)

    @GET("/api/edge/group-bans/{id}")
    fun getGroupBansResource(@Path("id") id:Int)

    @GET("/api/edge/group-categories")
    fun getGroupCategoriesCollection(@Field("group")group: String)

    @GET("/api/edge/group-categories/{id}")
    fun getGroupCategoriesResource(@Path("id") id:Int)

    @GET("/api/edge/group-invites")
    fun getGroupInvitesCollection(@Field("group")group: String)

    @GET("/api/edge/group-invites/{id}")
    fun getGroupInvitesResource(@Path("id") id:Int)

    @GET("/api/edge/group-member-notes")
    fun getGroupMemberNotesCollection(@Field("group")group: String)

    @GET("/api/edge/group-member-notes/{id}")
    fun getGroupMemberNotesResource(@Path("id") id:Int)

    @GET("/api/edge/group-members")
    fun getGroupMembersCollection(@Field("group")group: String)

    @GET("/api/edge/group-members/{id}")
    fun getGroupMembersResource(@Path("id") id:Int)

    @GET("/api/edge/group-permissions")
    fun getGroupPermissionsCollection(@Field("group")group: String)

    @GET("/api/edge/group-permissions/{id}")
    fun getGroupPermissionsResource(@Path("id") id:Int)

    /**
     * @param naughtyType Post, Comment, Review, Reaction
     * @param reason  nsfw, spoiler
     * @param status current, onHold
     */
    @GET("/api/edge/group-reports")
    fun getGroupReportsCollection(@Field("group")group: String, @Field("user")user: String,@Field("naughty")naughty: String,@Field("naughtyType")naughtyType: String,@Field("reason")reason: String,@Field("status")status: String)

    @GET("/api/edge/group-reports/{id}")
    fun getGroupReportsResource(@Path("id") id:Int)

    @GET("/api/edge/group-ticket-messages")
    fun getGroupTicketMessagesCollection(@Field("ticket")group: String)

    @GET("/api/edge/group-ticket-messages/{id}")
    fun getGroupTicketMessagesResource(@Path("id") id:Int)

    @GET("/api/edge/group-tickets")
    fun getGroupTicketCollection(@Field("group")group: String, @Field("user")user: String, @Field("assignee")assignee: String, @Field("status")status: String, @Field("queryGroup")queryGroup: String,@Field("query")query: String)

    @GET("/api/edge/group-tickets/{id}")
    fun getGroupTicketResource(@Path("id") id:Int)

    @GET("/api/edge/leader-chat-messages")
    fun getGroupLeaderChatMessagesCollection(@Field("groupId")group: String)

    @GET("/api/edge/leader-chat-messages/{id}")
    fun getGroupLeaderChatMessagesResource(@Path("id") id:Int)
    //endregion

    //region Anime
    /**
     *@param season	winter, spring, summer, fall
     *@param seasonYear	2017, 2005,2006
     *@param streamers	Crunchyroll
     *@param ageRating	G, PG,R,R18
     */
    @GET("/api/edge/anime")
    fun getAnimeCollection(@Field("season")season: String, @Field("seasonYear")seasonYear: Int,@Field("streamers")streamers: String,@Field("ageRating")ageRating: String)

    @GET("/api/edge/anime/{id}")
    fun getAnimeResource(@Path("id") id:Int)

    @GET("/api/edge/categories")
    fun getCategoriesCollection(@Field("parentId")season: Int, @Field("slug")slug: Int,@Field("nsfw")nsfw: Boolean)

    @GET("/api/edge/categories/{id}")
    fun getCategoriesResource(@Path("id") id:Int)

    @GET("/api/edge/category-favorites")
    fun getCategoryFavoritesCollection(@Field("userId")userId: Int, @Field("categoryId")categoryId: Int)

    @GET("/api/edge/category-favorites/{id}")
    fun getCategoryFavoritesResource(@Path("id") id:Int)

    /**
     * @param mangaId	2, '8,987'
     */
    @GET("/api/edge/chapters")
    fun getChaptersCollection(@Field("mangaId")mangaId: Int, @Field("number")number: Int)

    @GET("/api/edge/chapters/{id}")
    fun getChaptersResource(@Path("id") id:Int)

    @GET("/api/edge/drama")
    fun getDramaCollection()

    @GET("/api/edge/drama/{id}")
    fun getDramaResource(@Path("id") id:Int)

    /**
     * @param anime_id Only one
     * @param manga_id Only one
     * @param drama_id Only one
     * @param kind anime, 'anime,manga'
     */
    @GET("/api/edge/episodes")
    fun getEpisodesCollection(@Field("anime_id")anime_id:Int, @Field("manga_id")manga_id:Int, @Field("drama_id")drama_id:Int,@Field("kind")kind:String,@Field("number")number:Int)

    @GET("/api/edge/episodes/{id}")
    fun getEpisodesResource(@Path("id") id:Int)

    @GET("/api/edge/franchises")
    fun getFranchisesCollection()

    @GET("/api/edge/franchises/{id}")
    fun getFranchisesResource(@Path("id") id:Int)

    @GET("/api/edge/genres")
    fun getGenresCollection()

    @GET("/api/edge/genres/{id}")
    fun getGenresResource(@Path("id") id:Int)

    @GET("/api/edge/installments")
    fun getInstallmentsCollection(@Field("anime_id")anime_id:Int, @Field("manga_id")manga_id:Int, @Field("drama_id")drama_id:Int,@Field("kind")kind:String)

    @GET("/api/edge/installments/{id}")
    fun getInstallmentsResource(@Path("id") id:Int)

    @GET("/api/edge/manga")
    fun getMangaCollection(@Field("chapterCount")chapterCount:Int)

    @GET("/api/edge/manga/{id}")
    fun getMangaResource(@Path("id") id:Int)

    @GET("/api/edge/mappings")
    fun getMappingsCollection(@Field("externalSite")externalSite:String, @Field("externalId")externalId:Int)

    @GET("/api/edge/mappings/{id}")
    fun getMappingsResource(@Path("id") id:Int)

    @GET("/api/edge/media-attribute-votes")
    fun getMediaAttributeVotesCollection(@Field("createdAt")createdAt:String, @Field("userId")userId:Int, @Field("anime_id")anime_id:Int, @Field("manga_id")manga_id:Int, @Field("drama_id")drama_id:Int)

    @GET("/api/edge/media-attribute-votes/{id}")
    fun geMediaAttributeVotesResource(@Path("id") id:Int)

    @GET("/api/edge/media-attributes")
    fun getMediaAttributesCollection(@Field("slug")slug:String)

    @GET("/api/edge/media-attributes/{id}")
    fun getMediaAttributesResource(@Path("id") id:Int)

    @GET("/api/edge/media-follows")
    fun getMediaFollowsCollection(@Field("slug")slug:String)

    @GET("/api/edge/media-follows/{id}")
    fun getMediaFollowsResource(@Path("id") id:Int)

    @GET("/api/edge/media-relationships")
    fun getMediaRelationshipsCollection(@Field("role")role:String,@Field("sourceType")sourceType:String,@Field("sourceId")sourceId:Int,@Field("destinationId")destinationId:Int )

    @GET("/api/edge/media-relationships/{id}")
    fun getMediaRelationshipsResource(@Path("id") id:Int)

    @GET("/api/edge/streamers")
    fun getStreamersCollection()

    @GET("/api/edge/streamers/{id}")
    fun getStreamersResource(@Path("id") id:Int)

    @GET("/api/edge/streaming-links")
    fun getStreamingLinksCollection()

    @GET("/api/edge/streaming-links/{id}")
    fun getStreamingLinksResource(@Path("id") id:Int)

    @GET("/api/edge/trending/anime")
    fun getTrendingAnimeCollection()

    @GET("/api/edge/trending/drama")
    fun getTrendingDramaCollection()

    @GET("/api/edge/trending/manga")
    fun getTrendingMangaCollection()

    //endregion

    //region Posts
    @GET("/api/edge/comment-likes")
    fun getCommentLikesCollection(@Field("commentId")commentId: Int, @Field("userId")userId: Int)

    @GET("/api/edge/comment-likes/{id}")
    fun getCommentLikesResource(@Path("id") id:Int)

    @GET("/api/edge/comments")
    fun getCommentsCollection(@Field("postId")postId: Int, @Field("parentId")parentId: Int)

    @GET("/api/edge/comments/{id}")
    fun getCommentsResource(@Path("id") id:Int)

    //TODO: Create CRUD comments
    @POST("/api/edge/comments")
    fun postComment(@Body data:String)

    @PATCH("/api/edge/comments/{id}")
    fun updateComment(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/comments/{id}")
    fun deleteComment(@Path("id") id:Int,@Body data:String)

    @GET("/api/edge/post-likes")
    fun getPostLikesCollection(@Field("postId")postId: Int, @Field("userId")userId: Int)

    @GET("/api/edge/post-likes/{id}")
    fun getPostLikesResource(@Path("id") id:Int)

    @POST("/api/edge/post-likes")
    fun postPostLike(@Body data:String)

    @DELETE("/api/edge/post-likes/{id}")
    fun deletePostLike(@Path("id") id:Int,@Body data:String)



    @GET("/api/edge/post-follows")
    fun getPostFollowsCollection(@Field("postId")postId: Int, @Field("userId")userId: Int)

    @GET("/api/edgepost-follows/{id}")
    fun getPostFollowsResource(@Path("id") id:Int)

    @POST("/api/edge/post-follows")
    fun postPostFollow(@Body data:String)

    @DELETE("/api/edge/post-follows/{id}")
    fun deletePostFollow(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/posts")
    fun getPostsCollection(@Field("postId")postId: Int, @Field("parentId")parentId: Int)

    @GET("/api/edge/posts/{id}")
    fun getPostsResource(@Path("id") id:Int)

    @POST("/api/edge/posts")
    fun postPost(@Body data:String)

    @PATCH("/api/edge/posts/{id}")
    fun updatePost(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/posts/{id}")
    fun deletePost(@Path("id") id:Int,@Body data:String)

    @POST("/api/edge/reports")
    fun postReport(@Body data:String)

    @PATCH("/api/edge/reports/{id}")
    fun updateReport(@Path("id") id:Int,@Body data:String)


    //endregion

    //region Reactions
    @GET("/api/edge/media-reaction-votes")
    fun getMediaReactionVotesCollection(@Field("postId")postId: Int, @Field("parentId")parentId: Int)

    @GET("/api/edge/media-reaction-votes/{id}")
    fun getMediaReactionVotesResource(@Path("id") id:Int)

    @POST("/api/edge/media-reaction-votes")
    fun postMediaReactionVotes(@Body data:String)

    @DELETE("/api/edge/media-reaction-votes/{id}")
    fun deleteMediaReactionVotes(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/media-reactions")
    fun getMediaReactionCollection(@Field("createdAt")createdAt: String, @Field("upVotesCount")upVotesCount: Int, @Field("userId")userId: Int, @Field("anime_id")anime_id:Int, @Field("manga_id")manga_id:Int, @Field("drama_id")drama_id:Int,@Field("kind")kind:String)

    @GET("/api/edge/media-reactions/{id}")
    fun getMediaReactionResource(@Path("id") id:Int)

    @POST("/api/edge/media-reactions")
    fun postMediaReaction(@Body data:String)

    @PATCH("/api/edge/media-reactions/{id}")
    fun updateMediaReaction(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/media-reactions/{id}")
    fun deleteMediaReaction(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/review-likes")
    fun getReviewLikesCollection(@Field("reviewId")reviewId: Int, @Field("userId")userId: Int)

    @GET("/api/edge/review-likes/{id}")
    fun getReviewLikesResource(@Path("id") id:Int)

    @POST("/api/edge/review-likes")
    fun postReviewLikes(@Body data:String)

    @DELETE("/api/edge/review-likes/{id}")
    fun deleteReviewLikes(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/reviews")
    fun getReviewCollection(@Field("userId")userId: Int, @Field("anime_id")anime_id:Int, @Field("manga_id")manga_id:Int, @Field("drama_id")drama_id:Int,@Field("kind")kind:String)

    @GET("/api/edge/reviews/{id}")
    fun getReviewResource(@Path("id") id:Int)

    @POST("/api/edge/reviews")
    fun postReview(@Body data:String)

    @PATCH("/api/edge/reviews/{id}")
    fun updateReview(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/reviews/{id}")
    fun deleteReview(@Path("id") id:Int,@Body data:String)


    //endregion

    //region Site Announcements
    @GET("/api/edge/site-announcements")
    fun getSiteAnnouncementsCollection()

    @GET("/api/edge/site-announcements/{id}")
    fun getSiteAnnouncementsDramaResource(@Path("id") id:Int)
    //endregion

    //region User Libraries
    @GET("/api/edge/library-entries")
    fun getLibraryEntriesCollection(@Field("userId")userId: Int, @Field("anime_id")anime_id:Int, @Field("manga_id")manga_id:Int, @Field("drama_id")drama_id:Int,@Field("kind")kind:String,@Field("following")following:Boolean,@Field("since")since:Date,@Field("status")status:String,@Field("title")title:String)

    @GET("/api/edge/library-entries/{id}")
    fun getLibraryEntriesResource(@Path("id") id:Int)

    @POST("/api/edge/library-entries")
    fun postLibraryEntries(@Body data:String)

    @PATCH("/api/edge/library-entries/{id}")
    fun updateLibraryEntries(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/library-entries/{id}")
    fun deleteLibraryEntries(@Path("id") id:Int,@Body data:String)



    @GET("/api/edge/library-entry-logs")
    fun getLibraryEntriesLogsCollection(@Field("linkedAccountId")linkedAccountId: Int, @Field("syncStatus")syncStatus:String)

    @GET("/api/edge/library-entry-logs/{id}")
    fun getLibraryEntriesLogsResource(@Path("id") id:Int)

    @POST("/api/edge/library-entry-logs")
    fun postLibraryEntriesLogs(@Body data:String)

    @PATCH("/api/edge/library-entry-logs/{id}")
    fun updateLibraryEntriesLogs(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/library-entry-logs/{id}")
    fun deleteLibraryEntriesLogs(@Path("id") id:Int,@Body data:String)

    @GET("/api/edge/library-events")
    fun getLibraryEventsCollection(@Field("userId")userId: Int)

    @GET("/api/edge/library-events/{id}")
    fun geLibraryEventsResource(@Path("id") id:Int)


    //endregion

    //region Users
    @GET("/api/edge/blocks")
    fun getBlocksCollection(@Field("user")user: String)

    @GET("/api/edge/blocks/{id}")
    fun getBlocksResource(@Path("id") id:Int)

    @POST("/api/edge/blocks")
    fun postBlocks(@Body data:String)

    @DELETE("/api/edge/blocks/{id}")
    fun deleteBlocks(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/favorites")
    fun getFavoritesCollection(@Field("userId")userId: Int, @Field("itemType")itemType:String, @Field("itemId")itemId:String)

    @GET("/api/edge/favorites/{id}")
    fun getFavoritesResource(@Path("id") id:Int)

    @POST("/api/edge/favorites")
    fun postFavorites(@Body data:String)

    @PATCH("/api/edge/favorites/{id}")
    fun updateFavorites(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/favorites/{id}")
    fun deleteFavorites(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/follows")
    fun getFollowsCollection(@Field("follower")follower: Int, @Field("followed")followed:String)

    @GET("/api/edge/follows/{id}")
    fun getFollowsResource(@Path("id") id:Int)

    @POST("/api/edge/follows")
    fun postFollows(@Body data:String)

    @PATCH("/api/edge/follows/{id}")
    fun updateFollows(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/follows/{id}")
    fun deleteFollows(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/linked-accounts")
    fun getLinkedAccountsCollection(@Field("userId")userId: Int)

    @GET("/api/edge/linked-accounts/{id}")
    fun getLinkedAccountsResource(@Path("id") id:Int)

    @POST("/api/edge/linked-accounts")
    fun postLinkedAccounts(@Body data:String)

    @PATCH("/api/edge/linked-accounts/{id}")
    fun updateLinkedAccounts(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/linked-accounts/{id}")
    fun deleteLinkedAccounts(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/profile-link-sites")
    fun getProfileLinkSitesCollection(@Field("linkedAccountId")linkedAccountId: Int, @Field("syncStatus")syncStatus:String)

    @GET("/api/edge/profile-link-sites/{id}")
    fun getProfileLinkSitesResource(@Path("id") id:Int)

    @GET("/api/edge/profile-links")
    fun getProfileLinksCollection(@Field("linkedAccountId")linkedAccountId: Int, @Field("syncStatus")syncStatus:String)

    @GET("/api/edge/profile-links/{id}")
    fun getProfileLinksResource(@Path("id") id:Int)

    @POST("/api/edge/profile-links")
    fun postProfileLinks(@Body data:String)

    @PATCH("/api/edge/profile-links/{id}")
    fun updateProfileLinks(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/profile-links/{id}")
    fun deleteProfileLinks(@Path("id") id:Int,@Body data:String)


    @GET("/api/edge/roles")
    fun getRolesCollection()

    @GET("/api/edge/roles/{id}")
    fun getRolesResource(@Path("id") id:Int)

    @GET("/api/edge/stats")
    fun getStatsCollection(@Field("userId")userId:Int)

    @GET("/api/edge/stats/{id}")
    fun getStatsResource(@Path("id") id:Int)

    @GET("/api/edge/user-roles")
    fun getUserRolesCollection(@Field("userId")userId:Int)

    @GET("/api/edge/user-roles/{id}")
    fun getUserRolesResource(@Path("id") id:Int)


    @GET("/api/edge/users")
    fun getUsersCollection(@Field("slug")slug: String, @Field("name")name:String, @Field("self")self:String, @Field("query")query:String)

    @GET("/api/edge/users/{id}")
    fun getUsersResource(@Path("id") id:Int)

    @POST("/api/edge/users")
    fun postUsers(@Body data:String)

    @PATCH("/api/edge/users/{id}")
    fun updateUsers(@Path("id") id:Int,@Body data:String)

    @DELETE("/api/edge/users/{id}")
    fun deleteUsers(@Path("id") id:Int,@Body data:String)

    //endregion
}