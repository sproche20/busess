package com.bus.buses.Model
import com.bus.buses.repository.SalidRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.server.ResponseStatusException

@Service

class SalidService {
    @Autowired
    lateinit var salidRepository: SalidRepository
    fun list(): List<Salid> {
        return salidRepository.findAll()
    }
    @PostMapping
    fun save (salid: Salid):Salid {
        if (salid.horasal.equals(""))
        {
            throw Exception()
        }else
        {
            return salidRepository.save(salid)
        }

    }
    fun update(salid: Salid): Salid {
        return salidRepository.save(salid)
    }

    fun updateDescription (salid: Salid): Salid{
        try{
        val response = salidRepository.findById(salid.id)
            ?: throw Exception()
        response.apply {
            this.horasal=salid.horasal

        }
        return salidRepository.save(response)
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, "no HAY SALIDA", ex)
        }

    }

    fun delete (id:Long): Boolean{
        salidRepository.deleteById(id)
        return true
    }

}