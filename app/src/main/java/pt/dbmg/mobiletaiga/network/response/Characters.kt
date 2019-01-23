package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class Characters(
    @SerializedName("data")
    val `data`: List<DataCharacters>
)