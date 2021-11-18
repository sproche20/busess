package com.bus.buses.controller
import com.bus.buses.Model.Rutas
import com.bus.buses.Model.RutasService
import com.bus.buses.Model.Salid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rutas")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class RutasController {
    @Autowired
    lateinit var RutasService: RutasService

    @GetMapping
    fun list(): List<Rutas>{
        return RutasService.list()
    }
    @PostMapping
    fun save(rutas: Rutas): Rutas {
        return RutasService.save(rutas)
    }
    @PutMapping
    fun update (@RequestBody rutas: Rutas): Rutas {
        return  RutasService.update(rutas)
    }

    @PatchMapping
    fun updateDescription (@RequestBody rutas: Rutas): Rutas {
        return RutasService.updateDescription(rutas)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return RutasService.delete(id)
    }

}