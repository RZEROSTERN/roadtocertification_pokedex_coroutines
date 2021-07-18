package mx.dev1.pokedex.presentation.region

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mx.dev1.pokedex.core.domain.Region
import mx.dev1.pokedex.presentation.ApiDependencies

class RegionViewModel : ViewModel() {
    lateinit var dependencies: ApiDependencies
    val regionModel = MutableLiveData<MutableList<Region>>()

    fun getRegions() {
        viewModelScope.launch {
            val res = dependencies.getRegions()

            if(!res.results.isNullOrEmpty()) {
                regionModel.postValue(res.results)
            }
        }
    }
}