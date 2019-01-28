package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class AttributesCharacters(
    @SerializedName("createdAt")
    val createdAt: String, // 2017-07-27T22:21:26.824Z
    @SerializedName("description")
    val description: String, // Jet, known on his home satellite as the \"Black Dog\"...
    @SerializedName("image")
    val image: Image,
    @SerializedName("malId")
    val malId: Int, // 3
    @SerializedName("name")
    val name: String, // Jet Black
    @SerializedName("slug")
    val slug: String, // jet
    @SerializedName("updatedAt")
    val updatedAt: String // 2017-07-27T22:47:45.129Z
)