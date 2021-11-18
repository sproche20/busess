package com.bus.buses.repository


import com.bus.buses.Model.Rutas
import org.springframework.data.jpa.repository.JpaRepository

interface RutasRepository : JpaRepository<Rutas, Long> {
    interface WorkoutRepository: JpaRepository<Rutas, Long> {}
    fun findById(id: Long?): Rutas?
}