package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AllYears(
    @SerializedName("2004")
    val x2004: Int, // 1
    @SerializedName("2013")
    val x2013: Int, // 1
    @SerializedName("2016")
    val x2016: Int, // 2
    @SerializedName("2017")
    val x2017: Int, // 8
    @SerializedName("2018")
    val x2018: Int // 1
)