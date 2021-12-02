package com.bus.buses.Model
import com.bus.buses.repository.RutasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.server.ResponseStatusException

@Service

class RutasService {
    @Autowired
    lateinit var rutasRepository: RutasRepository
    fun list(): List<Rutas> {

        return rutasRepository.findAll()
    }
    @PostMapping
    fun save (rutas: Rutas):Rutas {
        if (rutas.ruta.equals(""))
        {
            throw Exception()
        }else
        {
            return rutasRepository.save(rutas)
        }
    }
    fun update(rutas: Rutas):Rutas  {
        return rutasRepository.save(rutas)
    }
    fun updateDescription (rutas: Rutas):Rutas {
        try{
        val response = rutasRepository.findById(rutas.id)
            ?: throw Exception()
        response.apply {
            this.ruta=rutas.ruta
        }
        return rutasRepository.save(response)
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, "la ruta no existe", ex)
        }
    }


    fun delete (id:Long): Boolean{
        rutasRepository.deleteById(id)
        return true
    }

}