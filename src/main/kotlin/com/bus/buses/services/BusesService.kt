package com.bus.buses.services

import com.bus.buses.Model.Buses
import com.bus.buses.repository.BusesRepository
import com.bus.buses.repository.SalidRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.server.ResponseStatusException

@Service

class BusesService {
    @Autowired
    lateinit var BusesRepository: BusesRepository
    fun list(): List<Buses> {
        return BusesRepository.findAll()
    }

    @PostMapping
    fun save (buses: Buses): Buses {
        if (buses.marcas.equals("")){
            throw Exception()

        }else
        {
        return BusesRepository.save(buses)
        }
    }
    fun update(buses: Buses): Buses {
        return BusesRepository.save(buses)
    }

    fun updateDescription (buses: Buses): Buses{
        try{
        val response = BusesRepository.findById(buses.id)
            ?: throw Exception()
        response.apply {
            this.marcas = buses.marcas
        }
        return BusesRepository.save(response)
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, " NO HAY BUSES EN SERVICIO. ", ex)
        }


    }



    fun delete (id:Long): Boolean{
        BusesRepository.deleteById(id)
        return true
    }

}