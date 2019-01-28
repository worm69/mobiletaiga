package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesPeople(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("image")
    val image: String, // https://media.kitsu.io/people/images/1/original.jpg?1416260317
    @SerializedName("malId")
    val malId: Int, // 6519
    @SerializedName("name")
    val name: String, // Masahiko Minami
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)