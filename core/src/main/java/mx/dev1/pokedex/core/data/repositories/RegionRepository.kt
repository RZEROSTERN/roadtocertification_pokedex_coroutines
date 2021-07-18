package mx.dev1.pokedex.core.data.repositories

import mx.dev1.pokedex.core.domain.results.RegionResult

interface RegionRepository {
    suspend fun getRegions(): RegionResult
}