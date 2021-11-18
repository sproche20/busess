package com.bus.buses.services

import com.bus.buses.Model.Buses
import com.bus.buses.repository.BusesRepository
import com.bus.buses.repository.SalidRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping

@Service

class BusesService {
    @Autowired
    lateinit var BusesRepository: BusesRepository
    fun list(): List<Buses> {
        return BusesRepository.findAll()
    }
    @PostMapping
    fun save (buses: Buses): Buses {
        return BusesRepository.save(buses)
    }
    fun update(buses: Buses): Buses {
        return BusesRepository.save(buses)
    }

    fun updateDescription (buses: Buses): Buses{
        val response = BusesRepository.findById(buses.id)
            ?: throw Exception()
        response.apply {
            //this.description=client.description

        }
        return BusesRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        BusesRepository.deleteById(id)
        return true
    }

}