package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: String, // Cowboy Bebop
    @SerializedName("en_jp")
    val enJp: String, // Cowbop Bebop
    @SerializedName("ja_jp")
    val jaJp: String // カウボーイビバップ
)