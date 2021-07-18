package mx.dev1.pokedex.presentation.region

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import mx.dev1.pokedex.R
import mx.dev1.pokedex.presentation.ApiDependencies
import org.koin.android.ext.android.inject

class RegionFragment : Fragment() {

    companion object {
        fun newInstance() = RegionFragment()
    }

    private lateinit var viewModel: RegionViewModel
    private val dependencies: ApiDependencies by inject()
    private lateinit var toolbar: Toolbar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.region_fragment, container, false)

        var activity = requireActivity() as AppCompatActivity
        toolbar = view.findViewById(R.id.tb_region)
        activity.setSupportActionBar(toolbar)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegionViewModel::class.java)
        viewModel.dependencies = dependencies

        viewModel.regionModel.observe(viewLifecycleOwner, Observer {
            it.forEach { itr -> Log.d("Region", itr.name.capitalize()) }
        })

        viewModel.getRegions()
    }

}