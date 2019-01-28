package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class TokenKitsu(
        @SerializedName("access_token")// Token used in Authorization
        val accessToken: String,
        @SerializedName("created_at")
        val createdAt: Int,
        @SerializedName("expires_in")// Seconds until the access_token expires (30 days default)
        val expiresIn: Int,
        @SerializedName("refresh_token")// Token used to get a new access_token
        val refreshToken: String,
        @SerializedName("scope")
        val scope: String,
        @SerializedName("token_type")
        val tokenType: String
)