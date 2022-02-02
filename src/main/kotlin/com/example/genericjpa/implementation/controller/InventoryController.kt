package com.example.genericjpa.implementation.controller

import com.example.genericjpa.implementation.model.Inventory
import com.example.genericjpa.implementation.service.InventoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/inventory")
class InventoryController(val service: InventoryService) {

    @GetMapping
    fun get(): Collection<Inventory> {
        return service.read()
    }

    @GetMapping(path = ["/{id}"])
    fun get(@PathVariable id: String): Inventory? {
        return service.read(id)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody Inventory: Inventory): Inventory {
        return service.create(Inventory)
    }

    @PutMapping
    fun update(@RequestBody Inventory: Inventory): Inventory? {
        return service.update(Inventory)
    }

    @DeleteMapping(path = ["/{id}"])
    fun delete(@PathVariable id: String): Boolean {
        return service.delete(id)
    }
}