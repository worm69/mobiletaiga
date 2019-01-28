package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Links4(
    @SerializedName("first")
    val first: String, // https://kitsu.io/api/edge/anime-staff?page%5Blimit%5D=10&page%5Boffset%5D=0
    @SerializedName("last")
    val last: String, // https://kitsu.io/api/edge/anime-staff?page%5Blimit%5D=10&page%5Boffset%5D=88533
    @SerializedName("next")
    val next: String, // https://kitsu.io/api/edge/anime-staff?page%5Blimit%5D=10&page%5Boffset%5D=10
    @SerializedName("prev")
    val prev: String // https://kitsu.io/api/edge/anime-staff?page%5Blimit%5D=10&page%5Boffset%5D=0
)