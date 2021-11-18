package com.bus.buses.controller
import com.bus.buses.Model.Salid
import com.bus.buses.Model.SalidService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/salid")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class SalidController {
    @Autowired
    lateinit var SalidService:SalidService

    @GetMapping
    fun list(): List<Salid>{
        return SalidService.list()
    }
    @PostMapping
    fun save(salid: Salid): Salid {
        return SalidService.save(salid)
    }
    @PutMapping
    fun update (@RequestBody salid: Salid): Salid {
        return  SalidService.update(salid)
    }

    @PatchMapping
    fun updateDescription (@RequestBody salid: Salid): Salid {
        return SalidService.updateDescription(salid)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return SalidService.delete(id)
    }

}