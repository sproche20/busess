package com.bus.buses.Model
import com.bus.buses.repository.SalidRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
@Service

class SalidService {
    @Autowired
    lateinit var salidRepository: SalidRepository
    fun list(): List<Salid> {
        return salidRepository.findAll()
    }
    @PostMapping
    fun save (salid: Salid):Salid {
        return salidRepository.save(salid)
    }
    fun update(salid: Salid): Salid {
        return salidRepository.save(salid)
    }

    fun updateDescription (salid: Salid): Salid{
        val response = salidRepository.findById(salid.id)
            ?: throw Exception()
        response.apply {
            //this.description=client.description

        }
        return salidRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        salidRepository.deleteById(id)
        return true
    }

}