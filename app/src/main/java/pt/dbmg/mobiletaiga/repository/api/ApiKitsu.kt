package pt.dbmg.mobiletaiga.repository.api

import io.reactivex.Observable
import pt.dbmg.mobiletaiga.network.response.AnimeCharacters
import pt.dbmg.mobiletaiga.network.response.AnimeCharactersPaged
import pt.dbmg.mobiletaiga.network.response.AnimePaged
import pt.dbmg.mobiletaiga.network.response.AnimeProductions
import pt.dbmg.mobiletaiga.network.response.AnimeProductionsPaged
import pt.dbmg.mobiletaiga.network.response.AnimeResource
import pt.dbmg.mobiletaiga.network.response.AnimeStaff
import pt.dbmg.mobiletaiga.network.response.AnimeStaffPaged
import pt.dbmg.mobiletaiga.network.response.Castings
import pt.dbmg.mobiletaiga.network.response.CastingsPaged
import pt.dbmg.mobiletaiga.network.response.CategoriesPaged
import pt.dbmg.mobiletaiga.network.response.CategoriesResource
import pt.dbmg.mobiletaiga.network.response.CategoryFavoritesPaged
import pt.dbmg.mobiletaiga.network.response.ChaptersPaged
import pt.dbmg.mobiletaiga.network.response.ChaptersResource
import pt.dbmg.mobiletaiga.network.response.Characters
import pt.dbmg.mobiletaiga.network.response.CharactersPaged
import pt.dbmg.mobiletaiga.network.response.CommentLikesPaged
import pt.dbmg.mobiletaiga.network.response.CommentLikesResource
import pt.dbmg.mobiletaiga.network.response.CommentsPaged
import pt.dbmg.mobiletaiga.network.response.CommentsResource
import pt.dbmg.mobiletaiga.network.response.DramaPaged
import pt.dbmg.mobiletaiga.network.response.DramaResource
import pt.dbmg.mobiletaiga.network.response.EpisodesPaged
import pt.dbmg.mobiletaiga.network.response.EpisodesResource
import pt.dbmg.mobiletaiga.network.response.FranchisesPaged
import pt.dbmg.mobiletaiga.network.response.FranchisesResource
import pt.dbmg.mobiletaiga.network.response.GenresPaged
import pt.dbmg.mobiletaiga.network.response.GenresResource
import pt.dbmg.mobiletaiga.network.response.GroupActionLogs
import pt.dbmg.mobiletaiga.network.response.GroupActionLogsPaged
import pt.dbmg.mobiletaiga.network.response.GroupBans
import pt.dbmg.mobiletaiga.network.response.GroupBansPaged
import pt.dbmg.mobiletaiga.network.response.GroupCategories
import pt.dbmg.mobiletaiga.network.response.GroupCategoriesPaged
import pt.dbmg.mobiletaiga.network.response.InstallmentsPaged
import pt.dbmg.mobiletaiga.network.response.InstallmentsResource
import pt.dbmg.mobiletaiga.network.response.LibraryEntries
import pt.dbmg.mobiletaiga.network.response.LibraryEntriesPaged
import pt.dbmg.mobiletaiga.network.response.LibraryEntryLogsPaged
import pt.dbmg.mobiletaiga.network.response.LibraryEntryLogsResource
import pt.dbmg.mobiletaiga.network.response.LibraryEvents
import pt.dbmg.mobiletaiga.network.response.LibraryEventsPaged
import pt.dbmg.mobiletaiga.network.response.MangaCharacters
import pt.dbmg.mobiletaiga.network.response.MangaCharactersPaged
import pt.dbmg.mobiletaiga.network.response.MangaPaged
import pt.dbmg.mobiletaiga.network.response.MangaResource
import pt.dbmg.mobiletaiga.network.response.MangaStaff
import pt.dbmg.mobiletaiga.network.response.MangaStaffPaged
import pt.dbmg.mobiletaiga.network.response.MappingsPaged
import pt.dbmg.mobiletaiga.network.response.MediaAttributeVotesPaged
import pt.dbmg.mobiletaiga.network.response.MediaAttributeVotesResource
import pt.dbmg.mobiletaiga.network.response.MediaAttributesPaged
import pt.dbmg.mobiletaiga.network.response.MediaAttributesResource
import pt.dbmg.mobiletaiga.network.response.MediaFollowsPaged
import pt.dbmg.mobiletaiga.network.response.MediaFollowsResource
import pt.dbmg.mobiletaiga.network.response.MediaReactionVotes
import pt.dbmg.mobiletaiga.network.response.MediaReactionVotesPaged
import pt.dbmg.mobiletaiga.network.response.MediaReactions
import pt.dbmg.mobiletaiga.network.response.MediaReactionsPaged
import pt.dbmg.mobiletaiga.network.response.MediaRelationshipsPaged
import pt.dbmg.mobiletaiga.network.response.MediaRelationshipsResource
import pt.dbmg.mobiletaiga.network.response.People
import pt.dbmg.mobiletaiga.network.response.PeoplePaged
import pt.dbmg.mobiletaiga.network.response.PostFollows
import pt.dbmg.mobiletaiga.network.response.PostFollowsPaged
import pt.dbmg.mobiletaiga.network.response.PostLikes
import pt.dbmg.mobiletaiga.network.response.PostLikesPaged
import pt.dbmg.mobiletaiga.network.response.PostPaged
import pt.dbmg.mobiletaiga.network.response.PostResource
import pt.dbmg.mobiletaiga.network.response.Producers
import pt.dbmg.mobiletaiga.network.response.ProducersPaged
import pt.dbmg.mobiletaiga.network.response.ReviewLikes
import pt.dbmg.mobiletaiga.network.response.ReviewLikesPaged
import pt.dbmg.mobiletaiga.network.response.ReviewsPaged
import pt.dbmg.mobiletaiga.network.response.ReviewsResource
import pt.dbmg.mobiletaiga.network.response.SiteAnnouncements
import pt.dbmg.mobiletaiga.network.response.SiteAnnouncementsPaged
import pt.dbmg.mobiletaiga.network.response.StreamersPaged
import pt.dbmg.mobiletaiga.network.response.StreamersResource
import pt.dbmg.mobiletaiga.network.response.StreamingLinksPaged
import pt.dbmg.mobiletaiga.network.response.TrendingAnime
import pt.dbmg.mobiletaiga.network.response.TrendingDrama
import pt.dbmg.mobiletaiga.network.response.TrendingManga
import pt.dbmg.mobiletaiga.network.response.UserBlocksError
import pt.dbmg.mobiletaiga.network.response.UserFavorites
import pt.dbmg.mobiletaiga.network.response.UserFavoritesPaged
import pt.dbmg.mobiletaiga.network.response.UserFollows
import pt.dbmg.mobiletaiga.network.response.UserFollowsPaged
import pt.dbmg.mobiletaiga.network.response.UserLinkedAccounts
import pt.dbmg.mobiletaiga.network.response.UserLinkedAccountsPaged
import pt.dbmg.mobiletaiga.network.response.UserProfileLinkSites
import pt.dbmg.mobiletaiga.network.response.UserProfileLinkSitesPaged
import pt.dbmg.mobiletaiga.network.response.UserProfileLinks
import pt.dbmg.mobiletaiga.network.response.UserProfileLinksPaged
import pt.dbmg.mobiletaiga.network.response.UserRolesPaged
import pt.dbmg.mobiletaiga.network.response.UserRolesResource
import pt.dbmg.mobiletaiga.network.response.UserStats
import pt.dbmg.mobiletaiga.network.response.UserStatsPaged
import pt.dbmg.mobiletaiga.network.response.UserUserRoles
import pt.dbmg.mobiletaiga.network.response.UserUserRolesPaged
import pt.dbmg.mobiletaiga.network.response.UsersBlocks
import pt.dbmg.mobiletaiga.network.response.UsersBlocksPaged
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

    //region Characters & People Done
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
    fun getCastingsCollection(
        @Field("anime_id") animeId: Int, @Field("manga_id") manga_Id: Int, @Field("drama_id") drama_id: Int, @Field(
            "mediaType"
        ) mediaType: String, @Field("language") language: String, @Field("featured") featured: Boolean, @Field("isCharacter") isCharacter: Boolean
    ): Observable<CastingsPaged>

    @GET("/api/edge/castings/{id}")
    fun getCastingsResource(@Path("id") id: Int): Observable<Castings>

    @GET("/api/edge/characters")
    fun getCharactersCollection(@Field("slug") slug: String, @Field("name") name: String): Observable<CharactersPaged>

    @GET("/api/edge/characters/{id}")
    fun getCharactersResource(@Path("id") id: Int): Observable<Characters>

    @GET("/api/edge/manga-characters")
    fun getMangaCharactersCollection(@Field("mangaId") slug: Int): Observable<MangaCharactersPaged>

    @GET("/api/edge/manga-characters/{id}")
    fun getMangaCharactersResource(@Path("id") id: Int): Observable<MangaCharacters>

    @GET("/api/edge/manga-staff")
    fun getMangaStaffCollection(@Field("mangaId") manga_Id: Int): Observable<MangaStaffPaged>

    @GET("/api/edge/manga-staff/{id}")
    fun getMangaStaffResource(@Path("id") id: Int): Observable<MangaStaff>

    @GET("/api/edge/people")
    fun getPeopleCollection(@Field("id") id: Int): Observable<PeoplePaged>

    @GET("/api/edge/people/{id}")
    fun getPeopleResource(@Path("id") id: Int): Observable<People>

    @GET("/api/edge/producers")
    fun getProducersCollection(@Field("slug") slug: String): Observable<ProducersPaged>

    @GET("/api/edge/producers/{id}")
    fun getProducersResource(@Path("id") id: Int): Observable<Producers>
    //endregion

    //region Groups
    @GET("/api/edge/group-action-logs")
    fun getGroupActionLogsCollection(@Field("group") group: String): Observable<GroupActionLogsPaged>

    @GET("/api/edge/group-action-logs/{id}")
    fun getGroupActionLogsResource(@Path("id") id: Int): Observable<GroupActionLogs>

    @GET("/api/edge/group-bans")
    fun getGroupBansCollection(@Field("group") group: String): Observable<GroupBansPaged>

    @GET("/api/edge/group-bans/{id}")
    fun getGroupBansResource(@Path("id") id: Int): Observable<GroupBans>

    @GET("/api/edge/group-categories")
    fun getGroupCategoriesCollection(@Field("group") group: String): Observable<GroupCategoriesPaged>

    @GET("/api/edge/group-categories/{id}")
    fun getGroupCategoriesResource(@Path("id") id: Int): Observable<GroupCategories>

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

    //region Media
    /**
     *@param season	winter, spring, summer, fall
     *@param seasonYear	2017, 2005,2006
     *@param streamers	Crunchyroll
     *@param ageRating	G, PG,R,R18
     */
    @GET("/api/edge/anime")
    fun getAnimeCollection(
        @Field("season") season: String, @Field("seasonYear") seasonYear: Int, @Field("streamers") streamers: String, @Field(
            "ageRating"
        ) ageRating: String
    ): Observable<AnimePaged>

    @GET("/api/edge/anime/{id}")
    fun getAnimeResource(@Path("id") id: Int): Observable<AnimeResource>

    @GET("/api/edge/categories")
    fun getCategoriesCollection(@Field("parentId") season: Int, @Field("slug") slug: Int, @Field("nsfw") nsfw: Boolean): Observable<CategoriesPaged>

    @GET("/api/edge/categories/{id}")
    fun getCategoriesResource(@Path("id") id: Int): Observable<CategoriesResource>


    @GET("/api/edge/category-favorites")
    fun getCategoryFavoritesCollection(@Field("userId") userId: Int, @Field("categoryId") categoryId: Int): Observable<CategoryFavoritesPaged>

    @GET("/api/edge/category-favorites/{id}")
    fun getCategoryFavoritesResource(@Path("id") id: Int): Observable<CategoriesResource>

    @POST("/api/edge/category-favorites")
    fun postCategoryFavorites(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/category-favorites/{id}")
    fun updateCategoryFavorites(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/category-favorites/{id}")
    fun deleteCategoryFavorites(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    /**
     * @param mangaId	2, '8,987'
     */
    @GET("/api/edge/chapters")
    fun getChaptersCollection(@Field("mangaId") mangaId: Int, @Field("number") number: Int): Observable<ChaptersPaged>

    @GET("/api/edge/chapters/{id}")
    fun getChaptersResource(@Path("id") id: Int): Observable<ChaptersResource>

    @GET("/api/edge/drama")
    fun getDramaCollection(): Observable<DramaPaged>

    @GET("/api/edge/drama/{id}")
    fun getDramaResource(@Path("id") id: Int): Observable<DramaResource>

    /**
     * @param anime_id Only one
     * @param manga_id Only one
     * @param drama_id Only one
     * @param kind anime, 'anime,manga'
     */
    @GET("/api/edge/episodes")
    fun getEpisodesCollection(
        @Field("anime_id") anime_id: Int, @Field("manga_id") manga_id: Int, @Field("drama_id") drama_id: Int, @Field(
            "kind"
        ) kind: String, @Field("number") number: Int
    ): Observable<EpisodesPaged>

    @GET("/api/edge/episodes/{id}")
    fun getEpisodesResource(@Path("id") id: Int): Observable<EpisodesResource>

    @GET("/api/edge/franchises")
    fun getFranchisesCollection(): Observable<FranchisesPaged>

    @GET("/api/edge/franchises/{id}")
    fun getFranchisesResource(@Path("id") id: Int): Observable<FranchisesResource>

    @GET("/api/edge/genres")
    fun getGenresCollection(): Observable<GenresPaged>

    @GET("/api/edge/genres/{id}")
    fun getGenresResource(@Path("id") id: Int): Observable<GenresResource>

    @GET("/api/edge/installments")
    fun getInstallmentsCollection(
        @Field("anime_id") anime_id: Int, @Field("manga_id") manga_id: Int, @Field("drama_id") drama_id: Int, @Field(
            "kind"
        ) kind: String
    ): Observable<InstallmentsPaged>

    @GET("/api/edge/installments/{id}")
    fun getInstallmentsResource(@Path("id") id: Int): Observable<InstallmentsResource>

    @GET("/api/edge/manga")
    fun getMangaCollection(@Field("chapterCount") chapterCount: Int): Observable<MangaPaged>

    @GET("/api/edge/manga/{id}")
    fun getMangaResource(@Path("id") id: Int): Observable<MangaResource>

    @GET("/api/edge/mappings")
    fun getMappingsCollection(@Field("externalSite") externalSite: String, @Field("externalId") externalId: Int): Observable<MappingsPaged>

    @GET("/api/edge/mappings/{id}")
    fun getMappingsResource(@Path("id") id: Int): Observable<MangaResource>

    @GET("/api/edge/media-attribute-votes")
    fun getMediaAttributeVotesCollection(
        @Field("createdAt") createdAt: String, @Field("userId") userId: Int, @Field("anime_id") anime_id: Int, @Field(
            "manga_id"
        ) manga_id: Int, @Field("drama_id") drama_id: Int
    ): Observable<MediaAttributeVotesPaged>

    @GET("/api/edge/media-attribute-votes/{id}")
    fun geMediaAttributeVotesResource(@Path("id") id: Int): Observable<MediaAttributeVotesResource>

    @POST("/api/edge/media-attribute-votes")
    fun postMediaAttributeVotes(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/media-attribute-votes/{id}")
    fun updateMediaAttributeVotes(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/media-attribute-votes/{id}")
    fun deleteMediaAttributeVotes(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/media-attributes")
    fun getMediaAttributesCollection(@Field("slug") slug: String): Observable<MediaAttributesPaged>

    @GET("/api/edge/media-attributes/{id}")
    fun getMediaAttributesResource(@Path("id") id: Int): Observable<MediaAttributesResource>

    @GET("/api/edge/media-follows")
    fun getMediaFollowsCollection(@Field("slug") slug: String): Observable<MediaFollowsPaged>

    @GET("/api/edge/media-follows/{id}")
    fun getMediaFollowsResource(@Path("id") id: Int): Observable<MediaFollowsResource>

    @GET("/api/edge/media-relationships")
    fun getMediaRelationshipsCollection(
        @Field("role") role: String, @Field("sourceType") sourceType: String, @Field("sourceId") sourceId: Int, @Field(
            "destinationId"
        ) destinationId: Int
    ): Observable<MediaRelationshipsPaged>

    @GET("/api/edge/media-relationships/{id}")
    fun getMediaRelationshipsResource(@Path("id") id: Int): Observable<MediaRelationshipsResource>

    @GET("/api/edge/streamers")
    fun getStreamersCollection(): Observable<StreamersPaged>

    @GET("/api/edge/streamers/{id}")
    fun getStreamersResource(@Path("id") id: Int): Observable<StreamersResource>

    @GET("/api/edge/streaming-links")
    fun getStreamingLinksCollection(): Observable<StreamingLinksPaged>

    @GET("/api/edge/streaming-links/{id}")
    fun getStreamingLinksResource(@Path("id") id: Int): Observable<StreamersResource>

    @GET("/api/edge/trending/anime")
    fun getTrendingAnimeCollection(): Observable<TrendingAnime>

    @GET("/api/edge/trending/drama")
    fun getTrendingDramaCollection(): Observable<TrendingDrama>

    @GET("/api/edge/trending/manga")
    fun getTrendingMangaCollection(): Observable<TrendingManga>

    //endregion

    //region Posts Done
    @GET("/api/edge/comment-likes")
    fun getCommentLikesCollection(@Field("commentId") commentId: Int, @Field("userId") userId: Int): Observable<CommentLikesPaged>

    @GET("/api/edge/comment-likes/{id}")
    fun getCommentLikesResource(@Path("id") id: Int): Observable<CommentLikesResource>

    @POST("api/edge/comment-likes")
    fun postCommentLike(@Body data: String): Observable<UserBlocksError>

    @DELETE("api/edge/comment-likes/{id}")
    fun deleteCommentLike(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/comments")
    fun getCommentsCollection(@Field("postId") postId: Int, @Field("parentId") parentId: Int): Observable<CommentsPaged>

    @GET("/api/edge/comments/{id}")
    fun getCommentsResource(@Path("id") id: Int): Observable<CommentsResource>

    @POST("/api/edge/comments")
    fun postComment(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/comments/{id}")
    fun updateComment(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/comments/{id}")
    fun deleteComment(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/post-likes")
    fun getPostLikesCollection(@Field("postId") postId: Int, @Field("userId") userId: Int): Observable<PostLikesPaged>

    @GET("/api/edge/post-likes/{id}")
    fun getPostLikesResource(@Path("id") id: Int): Observable<PostLikes>

    @POST("/api/edge/post-likes")
    fun postPostLike(@Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/post-likes/{id}")
    fun deletePostLike(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>



    @GET("/api/edge/post-follows")
    fun getPostFollowsCollection(@Field("postId") postId: Int, @Field("userId") userId: Int): Observable<PostFollowsPaged>

    @GET("/api/edgepost-follows/{id}")
    fun getPostFollowsResource(@Path("id") id: Int): Observable<PostFollows>

    @POST("/api/edge/post-follows")
    fun postPostFollow(@Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/post-follows/{id}")
    fun deletePostFollow(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/posts")
    fun getPostsCollection(@Field("postId") postId: Int, @Field("parentId") parentId: Int): Observable<PostPaged>

    @GET("/api/edge/posts/{id}")
    fun getPostsResource(@Path("id") id: Int): Observable<PostResource>

    @POST("/api/edge/posts")
    fun postPost(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/posts/{id}")
    fun updatePost(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/posts/{id}")
    fun deletePost(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @POST("/api/edge/reports")
    fun postReport(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/reports/{id}")
    fun updateReport(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    //endregion

    //region Reactions Done
    @GET("/api/edge/media-reaction-votes")
    fun getMediaReactionVotesCollection(@Field("postId") postId: Int, @Field("parentId") parentId: Int): Observable<MediaReactionVotesPaged>

    @GET("/api/edge/media-reaction-votes/{id}")
    fun getMediaReactionVotesResource(@Path("id") id: Int): Observable<MediaReactionVotes>

    @POST("/api/edge/media-reaction-votes")
    fun postMediaReactionVotes(@Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/media-reaction-votes/{id}")
    fun deleteMediaReactionVotes(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/media-reactions")
    fun getMediaReactionCollection(
        @Field("createdAt") createdAt: String, @Field("upVotesCount") upVotesCount: Int, @Field(
            "userId"
        ) userId: Int, @Field("anime_id") anime_id: Int, @Field("manga_id") manga_id: Int, @Field("drama_id") drama_id: Int, @Field(
            "kind"
        ) kind: String
    ): Observable<MediaReactionsPaged>

    @GET("/api/edge/media-reactions/{id}")
    fun getMediaReactionResource(@Path("id") id: Int): Observable<MediaReactions>

    @POST("/api/edge/media-reactions")
    fun postMediaReaction(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/media-reactions/{id}")
    fun updateMediaReaction(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/media-reactions/{id}")
    fun deleteMediaReaction(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/review-likes")
    fun getReviewLikesCollection(@Field("reviewId") reviewId: Int, @Field("userId") userId: Int): Observable<ReviewLikesPaged>

    @GET("/api/edge/review-likes/{id}")
    fun getReviewLikesResource(@Path("id") id: Int): Observable<ReviewLikes>

    @POST("/api/edge/review-likes")
    fun postReviewLikes(@Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/review-likes/{id}")
    fun deleteReviewLikes(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/reviews")
    fun getReviewCollection(
        @Field("userId") userId: Int, @Field("anime_id") anime_id: Int, @Field("manga_id") manga_id: Int, @Field(
            "drama_id"
        ) drama_id: Int, @Field("kind") kind: String
    ): Observable<ReviewsPaged>

    @GET("/api/edge/reviews/{id}")
    fun getReviewResource(@Path("id") id: Int): Observable<ReviewsResource>

    @POST("/api/edge/reviews")
    fun postReview(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/reviews/{id}")
    fun updateReview(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/reviews/{id}")
    fun deleteReview(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    //endregion

    //region Site Announcements Done
    @GET("/api/edge/site-announcements")
    fun getSiteAnnouncementsCollection(): Observable<SiteAnnouncementsPaged>

    @GET("/api/edge/site-announcements/{id}")
    fun getSiteAnnouncementsDramaResource(@Path("id") id: Int): Observable<SiteAnnouncements>
    //endregion

    //region User Libraries Done
    @GET("/api/edge/library-entries")
    fun getLibraryEntriesCollection(
        @Field("userId") userId: Int, @Field("anime_id") anime_id: Int, @Field("manga_id") manga_id: Int, @Field(
            "drama_id"
        ) drama_id: Int, @Field("kind") kind: String, @Field("following") following: Boolean, @Field("since") since: Date, @Field(
            "status"
        ) status: String, @Field("title") title: String
    ): Observable<LibraryEntriesPaged>

    @GET("/api/edge/library-entries/{id}")
    fun getLibraryEntriesResource(@Path("id") id: Int): Observable<LibraryEntries>

    @POST("/api/edge/library-entries")
    fun postLibraryEntries(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/library-entries/{id}")
    fun updateLibraryEntries(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/library-entries/{id}")
    fun deleteLibraryEntries(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @GET("/api/edge/library-entry-logs")
    fun getLibraryEntriesLogsCollection(@Field("linkedAccountId") linkedAccountId: Int, @Field("syncStatus") syncStatus: String): Observable<LibraryEntryLogsPaged>

    @GET("/api/edge/library-entry-logs/{id}")
    fun getLibraryEntriesLogsResource(@Path("id") id: Int): Observable<LibraryEntryLogsResource>

    @POST("/api/edge/library-entry-logs")
    fun postLibraryEntriesLogs(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/library-entry-logs/{id}")
    fun updateLibraryEntriesLogs(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/library-entry-logs/{id}")
    fun deleteLibraryEntriesLogs(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @GET("/api/edge/library-events")
    fun getLibraryEventsCollection(@Field("userId") userId: Int): Observable<LibraryEventsPaged>

    @GET("/api/edge/library-events/{id}")
    fun geLibraryEventsResource(@Path("id") id: Int): Observable<LibraryEvents>


    //endregion

    //region Users Done
    @GET("/api/edge/blocks")
    fun getBlocksCollection(@Field("user") user: String): Observable<UsersBlocksPaged>

    @GET("/api/edge/blocks/{id}")
    fun getBlocksResource(@Path("id") id: Int): Observable<UsersBlocks>

    @POST("/api/edge/blocks")
    fun postBlocks(@Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/blocks/{id}")
    fun deleteBlocks(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/favorites")
    fun getFavoritesCollection(@Field("userId") userId: Int, @Field("itemType") itemType: String, @Field("itemId") itemId: String): Observable<UserFavoritesPaged>

    @GET("/api/edge/favorites/{id}")
    fun getFavoritesResource(@Path("id") id: Int): Observable<UserFavorites>

    @POST("/api/edge/favorites")
    fun postFavorites(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/favorites/{id}")
    fun updateFavorites(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/favorites/{id}")
    fun deleteFavorites(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/follows")
    fun getFollowsCollection(@Field("follower") follower: Int, @Field("followed") followed: String): Observable<UserFollowsPaged>

    @GET("/api/edge/follows/{id}")
    fun getFollowsResource(@Path("id") id: Int): Observable<UserFollows>

    @POST("/api/edge/follows")
    fun postFollows(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/follows/{id}")
    fun updateFollows(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/follows/{id}")
    fun deleteFollows(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/linked-accounts")
    fun getLinkedAccountsCollection(@Field("userId") userId: Int): Observable<UserLinkedAccountsPaged>

    @GET("/api/edge/linked-accounts/{id}")
    fun getLinkedAccountsResource(@Path("id") id: Int): Observable<UserLinkedAccounts>

    @POST("/api/edge/linked-accounts")
    fun postLinkedAccounts(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/linked-accounts/{id}")
    fun updateLinkedAccounts(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/linked-accounts/{id}")
    fun deleteLinkedAccounts(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/profile-link-sites")
    fun getProfileLinkSitesCollection(@Field("linkedAccountId") linkedAccountId: Int, @Field("syncStatus") syncStatus: String): Observable<UserProfileLinkSitesPaged>

    @GET("/api/edge/profile-link-sites/{id}")
    fun getProfileLinkSitesResource(@Path("id") id: Int): Observable<UserProfileLinkSites>

    @GET("/api/edge/profile-links")
    fun getProfileLinksCollection(@Field("linkedAccountId") linkedAccountId: Int, @Field("syncStatus") syncStatus: String): Observable<UserProfileLinksPaged>

    @GET("/api/edge/profile-links/{id}")
    fun getProfileLinksResource(@Path("id") id: Int): Observable<UserProfileLinks>

    @POST("/api/edge/profile-links")
    fun postProfileLinks(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/profile-links/{id}")
    fun updateProfileLinks(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/profile-links/{id}")
    fun deleteProfileLinks(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>


    @GET("/api/edge/roles")
    fun getRolesCollection(): Observable<UserRolesPaged>

    @GET("/api/edge/roles/{id}")
    fun getRolesResource(@Path("id") id: Int): Observable<UserRolesResource>

    @GET("/api/edge/stats")
    fun getStatsCollection(@Field("userId") userId: Int): Observable<UserStatsPaged>

    @GET("/api/edge/stats/{id}")
    fun getStatsResource(@Path("id") id: Int): Observable<UserStats>

    @GET("/api/edge/user-roles")
    fun getUserRolesCollection(@Field("userId") userId: Int): Observable<UserUserRolesPaged>

    @GET("/api/edge/user-roles/{id}")
    fun getUserRolesResource(@Path("id") id: Int): Observable<UserUserRoles>


    @GET("/api/edge/users")
    fun getUsersCollection(
        @Field("slug") slug: String, @Field("name") name: String, @Field("self") self: String, @Field(
            "query"
        ) query: String
    ): Observable<UserUserRolesPaged>

    @GET("/api/edge/users/{id}")
    fun getUsersResource(@Path("id") id: Int): Observable<UserUserRoles>

    @POST("/api/edge/users")
    fun postUsers(@Body data: String): Observable<UserBlocksError>

    @PATCH("/api/edge/users/{id}")
    fun updateUsers(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    @DELETE("/api/edge/users/{id}")
    fun deleteUsers(@Path("id") id: Int, @Body data: String): Observable<UserBlocksError>

    //endregion
}