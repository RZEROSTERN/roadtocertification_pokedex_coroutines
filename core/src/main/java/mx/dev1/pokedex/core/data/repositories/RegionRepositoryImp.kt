package mx.dev1.pokedex.core.data.repositories

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import mx.dev1.pokedex.core.data.RetrofitHelper
import mx.dev1.pokedex.core.domain.Region
import mx.dev1.pokedex.core.domain.results.RegionResult
import mx.dev1.pokedex.core.data.network.RestApi

class RegionRepositoryImp: RegionRepository{
    private val retrofit = RetrofitHelper.getClient().create(RestApi::class.java)

    override suspend fun getRegions(): RegionResult {
        return withContext(Dispatchers.IO) {
            val response = retrofit.getRegions()
            response.body() ?: RegionResult(Integer(0), "", "", ArrayList<Region>())
        }
    }
}