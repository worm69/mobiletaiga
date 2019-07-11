package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class KitsuToken(
    @SerializedName("access_token")
    val accessToken: String, // abc123
    @SerializedName("created_at")
    val createdAt: Int, // 1518235801
    @SerializedName("expires_in")
    val expiresIn: Int, // 2591963
    @SerializedName("refresh_token")
    val refreshToken: String, // 123abc
    @SerializedName("scope")
    val scope: String, // public
    @SerializedName("token_type")
    val tokenType: String // bearer
)