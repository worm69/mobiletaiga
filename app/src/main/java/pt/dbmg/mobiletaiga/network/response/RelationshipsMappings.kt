package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class RelationshipsMappings(
    @SerializedName("item")
    val item: Item
)