package com.bus.buses.Model
import com.bus.buses.repository.ChoferRepository
import com.bus.buses.repository.SalidRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
@Service

class ChoferService {
    @Autowired
    lateinit var ChoferRepository: ChoferRepository
    fun list(): List<Chofer> {
        return ChoferRepository.findAll()
    }
    @PostMapping
    fun save (chofer: Chofer):Chofer {
        return ChoferRepository.save(chofer)
    }
    fun update(chofer: Chofer):Chofer {
        return ChoferRepository.save(chofer)
    }

    fun updateDescription (chofer: Chofer):Chofer{
        val response = ChoferRepository.findById(chofer.id)
            ?: throw Exception()
        response.apply {
            //this.description=client.description

        }
        return ChoferRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        ChoferRepository.deleteById(id)
        return true
    }

}