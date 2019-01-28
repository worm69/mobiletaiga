package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class GenresResource(
    @SerializedName("data")
    val `data`: List<DataGenres>
)