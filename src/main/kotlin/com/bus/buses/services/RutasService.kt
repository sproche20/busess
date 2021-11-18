package com.bus.buses.Model
import com.bus.buses.repository.RutasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
@Service

class RutasService {
    @Autowired
    lateinit var rutasRepository: RutasRepository
    fun list(): List<Rutas> {
        return rutasRepository.findAll()
    }
    @PostMapping
    fun save (rutas: Rutas):Rutas {
        return rutasRepository.save(rutas)
    }
    fun update(rutas: Rutas):Rutas  {
        return rutasRepository.save(rutas)
    }
    fun updateDescription (rutas: Rutas):Rutas {
        val response = rutasRepository.findById(rutas.id)
            ?: throw Exception()
        response.apply {
            //this.description=client.description

        }
        return rutasRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        rutasRepository.deleteById(id)
        return true
    }

}