package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class StatsData(
    @SerializedName("activity")
    val activity: List<Activity>,
    @SerializedName("all_categories")
    val allCategories: AllCategories,
    @SerializedName("all_time")
    val allTime: AllTime,
    @SerializedName("all_years")
    val allYears: AllYears,
    @SerializedName("total")
    val total: Int, // 1500
    @SerializedName("total_media")
    val totalMedia: Int // 343
)