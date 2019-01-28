package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Avatar(
    @SerializedName("large")
    val large: String, // https://media.kitsu.io/groups/avatars/1/large.gif?1424323296
    @SerializedName("medium")
    val medium: String, // https://media.kitsu.io/groups/avatars/1/medium.gif?1424323296
    @SerializedName("meta")
    val meta: MetaX,
    @SerializedName("original")
    val original: String, // https://media.kitsu.io/groups/avatars/1/original.gif?1424323296
    @SerializedName("small")
    val small: String, // https://media.kitsu.io/groups/avatars/1/small.gif?1424323296
    @SerializedName("tiny")
    val tiny: String // https://media.kitsu.io/groups/avatars/1/tiny.gif?1424323296
)