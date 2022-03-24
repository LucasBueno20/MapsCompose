package com.example.mapscompose.domain.repository

import com.example.mapscompose.domain.model.ParkingSpot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository{
   suspend fun insertParkingSpot(spot: ParkingSpot)

   suspend fun deleteParkingSpot(spot: ParkingSpot)

   fun getParkingSpots(): Flow<List<ParkingSpot>>
}