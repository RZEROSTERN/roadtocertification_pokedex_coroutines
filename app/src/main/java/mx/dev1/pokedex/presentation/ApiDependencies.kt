package mx.dev1.pokedex.presentation

import mx.dev1.pokedex.core.interactors.RegionInteractor

class ApiDependencies(private val regionInteractor: RegionInteractor) {
    suspend fun getRegions() = regionInteractor.getRegions()
}