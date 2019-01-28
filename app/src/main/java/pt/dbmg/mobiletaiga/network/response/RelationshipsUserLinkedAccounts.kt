package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsUserLinkedAccounts(
    @SerializedName("libraryEntryLogs")
    val libraryEntryLogs: LibraryEntryLogs,
    @SerializedName("user")
    val user: User
)