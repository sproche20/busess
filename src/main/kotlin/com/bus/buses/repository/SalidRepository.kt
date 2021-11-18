package com.bus.buses.repository

import com.bus.buses.Model.Salid
import org.springframework.data.jpa.repository.JpaRepository

interface SalidRepository:JpaRepository<Salid,Long>  {
    interface WorkoutRepository: JpaRepository<Salid, Long> {}
    fun findById(id: Long?): Salid?
}