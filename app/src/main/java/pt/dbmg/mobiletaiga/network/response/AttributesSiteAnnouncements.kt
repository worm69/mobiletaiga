package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesSiteAnnouncements(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-05-12T02:15:29.309Z
    @SerializedName("description")
    val description: String, // A new release is upon us. Featuring mostly bug fixes but a few quality of life tweaks!
    @SerializedName("imageUrl")
    val imageUrl: String, // https://media.giphy.com/media/3og0IEXRvwMN0cLSaQ/giphy.gif
    @SerializedName("link")
    val link: String, // https://medium.com/heykitsu/kitsu-release-notes-may-11th-2017-803bacc10e34
    @SerializedName("title")
    val title: String, // It's update time!
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-05-12T02:15:29.309Z
)