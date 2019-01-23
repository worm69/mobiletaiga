package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class UserFavoritesPaged(
    @SerializedName("data")
    val `data`: List<DataUserFavorites>,
    @SerializedName("links")
    val links: Links4,
    @SerializedName("meta")
    val meta: Meta
)