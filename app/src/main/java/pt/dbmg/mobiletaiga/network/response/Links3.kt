package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Links3(
    @SerializedName("first")
    val first: String, // https://kitsu.io/api/edge/anime-characters?page%5Blimit%5D=10&page%5Boffset%5D=0
    @SerializedName("last")
    val last: String, // https://kitsu.io/api/edge/anime-characters?page%5Blimit%5D=10&page%5Boffset%5D=109338
    @SerializedName("next")
    val next: String // https://kitsu.io/api/edge/anime-characters?page%5Blimit%5D=10&page%5Boffset%5D=10
)