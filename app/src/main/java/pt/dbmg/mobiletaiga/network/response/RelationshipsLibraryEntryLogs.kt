package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsLibraryEntryLogs(
    @SerializedName("linkedAccount")
    val linkedAccount: LinkedAccount,
    @SerializedName("media")
    val media: Media
)