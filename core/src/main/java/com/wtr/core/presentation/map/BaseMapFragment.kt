package com.wtr.core.presentation.map

import android.os.Bundle
import android.view.View
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.wtr.core.presentation.main.BaseFragment

abstract class BaseMapFragment : BaseFragment(), OnMapReadyCallback {

    lateinit var mapView: MapView

    abstract var mapViewId: Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapView = view.findViewById(mapViewId)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }
}
