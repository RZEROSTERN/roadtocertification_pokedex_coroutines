package mx.dev1.pokedex.core.interactors

import mx.dev1.pokedex.core.data.repositories.RegionRepositoryImp
import mx.dev1.pokedex.core.domain.results.RegionResult

class RegionInteractorImp(private val regionRepositoryImp: RegionRepositoryImp): RegionInteractor {
    override suspend fun getRegions() = regionRepositoryImp.getRegions()
}