package com.bus.buses.repository

import com.bus.buses.Model.Buses
import com.bus.buses.Model.Salid
import org.springframework.data.jpa.repository.JpaRepository

interface BusesRepository:JpaRepository<Buses,Long>   {
    interface WorkoutRepository: JpaRepository<Buses, Long> {}
    fun findById(id: Long?): Buses?
}