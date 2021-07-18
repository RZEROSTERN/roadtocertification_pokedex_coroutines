package mx.dev1.pokedex.core.data.network

import mx.dev1.pokedex.core.domain.results.RegionResult
import retrofit2.Response
import retrofit2.http.GET

interface RestApi {
    @GET("region")
    suspend fun getRegions(): Response<RegionResult>
}