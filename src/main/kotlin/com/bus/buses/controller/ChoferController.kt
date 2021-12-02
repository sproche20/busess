package com.bus.buses.controller
import com.bus.buses.Model.Chofer
import com.bus.buses.Model.ChoferService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/chofer")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ChoferController {
    @Autowired
    lateinit var ChoferService:ChoferService
    @GetMapping
    fun list(): List<Chofer>{
        return ChoferService.list()
    }
    @PostMapping
    fun save(chofer: Chofer): Chofer {
        return ChoferService.save(chofer)
    }
    @PutMapping
    fun update (@RequestBody chofer: Chofer): Chofer {
        return  ChoferService.update(chofer)
    }

    @PatchMapping
    fun updateDescription (@RequestBody chofer: Chofer): Chofer {
        return ChoferService.updateDescription(chofer)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return ChoferService.delete(id)
    }

}