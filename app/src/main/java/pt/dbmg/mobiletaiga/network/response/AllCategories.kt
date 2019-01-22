package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AllCategories(
    @SerializedName("alien")
    val alien: Int, // 21
    @SerializedName("angel")
    val angel: Int, // 2
    @SerializedName("angst")
    val angst: Int, // 32
    @SerializedName("asia")
    val asia: Int, // 106
    @SerializedName("china")
    val china: Int, // 1
    @SerializedName("cops")
    val cops: Int, // 10
    @SerializedName("crime")
    val crime: Int, // 10
    @SerializedName("deity")
    val deity: Int, // 6
    @SerializedName("demon")
    val demon: Int, // 6
    @SerializedName("idol")
    val idol: Int, // 4
    @SerializedName("mars")
    val mars: Int, // 2
    @SerializedName("navy")
    val navy: Int, // 3
    @SerializedName("past")
    val past: Int, // 11
    @SerializedName("war")
    val war: Int // 13
)