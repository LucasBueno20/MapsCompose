package com.example.mapscompose.domain.model

import com.google.android.gms.maps.model.LatLng

data class ParkingSpot(
    val lat: Double,
    val lng: Double,
    val id: Int? = null
)
