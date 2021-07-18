package mx.dev1.pokedex.core.interactors

import mx.dev1.pokedex.core.domain.results.RegionResult

interface RegionInteractor {
    suspend fun getRegions(): RegionResult
}