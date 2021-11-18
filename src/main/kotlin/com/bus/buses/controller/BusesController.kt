package com.bus.buses.controller
import com.bus.buses.Model.Buses
import com.bus.buses.services.BusesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/buses")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class BusesController {
    @Autowired
    lateinit var BusesService: BusesService

    @GetMapping
    fun list(): List<Buses> {
        return BusesService.list()
    }
    @PostMapping
    fun save(buses:Buses): Buses {
        return BusesService.save(buses)
    }
    @PutMapping
    fun update (@RequestBody buses: Buses): Buses {
        return BusesService.update(buses)
    }

    @PatchMapping
    fun updateDescription (@RequestBody buses: Buses): Buses {
        return BusesService.updateDescription(buses)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return BusesService.delete(id)
    }

}