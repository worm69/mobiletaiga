package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Activity(
    @SerializedName("anime_id")
    val animeId: Int, // 41
    @SerializedName("changed_data")
    val changedData: ChangedData,
    @SerializedName("created_at")
    val createdAt: String, // 2017-06-13T05:12:24.186Z
    @SerializedName("drama_id")
    val dramaId: Any, // null
    @SerializedName("event")
    val event: String, // updated
    @SerializedName("id")
    val id: Int, // 231341
    @SerializedName("library_entry_id")
    val libraryEntryId: Int, // 17413724
    @SerializedName("manga_id")
    val mangaId: Any, // null
    @SerializedName("updated_at")
    val updatedAt: String, // 2017-06-13T05:12:24.186Z
    @SerializedName("user_id")
    val userId: Int // 18097
)