package mx.dev1.pokedex.core.domain.results

import com.google.gson.annotations.SerializedName
import mx.dev1.pokedex.core.domain.Region

data class RegionResult (
    @SerializedName("count")
    val count: Integer,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: MutableList<Region>
)