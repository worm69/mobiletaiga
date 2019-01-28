package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GroupPermissionsPaged(
    @SerializedName("data")
    val `data`: List<DataGroupPermissions>
)