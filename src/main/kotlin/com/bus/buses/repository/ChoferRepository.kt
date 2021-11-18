package com.bus.buses.repository

import com.bus.buses.Model.Chofer
import org.springframework.data.jpa.repository.JpaRepository

interface ChoferRepository: JpaRepository<Chofer, Long> {
    interface WorkoutRepository: JpaRepository<Chofer, Long> {}
    fun findById(id: Long?): Chofer?
}