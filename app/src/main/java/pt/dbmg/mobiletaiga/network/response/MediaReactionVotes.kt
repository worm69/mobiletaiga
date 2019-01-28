package pt.dbmg.mobiletaiga.network.response

import com.google.gson.annotations.SerializedName

data class MediaReactionVotes(
    @SerializedName("data")
    val `data`: List<DataMediaReactionVotes>
)