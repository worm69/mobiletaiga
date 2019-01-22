package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Token(
    @SerializedName("application")
    val application: Application,
    @SerializedName("created_at")
    val createdAt: Int, // 1508818017
    @SerializedName("expires_in_seconds")
    val expiresInSeconds: Int, // 2592000
    @SerializedName("resource_owner_id")
    val resourceOwnerId: Int, // 29629
    @SerializedName("scopes")
    val scopes: List<String>
)