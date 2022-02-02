package com.example.genericjpa.implementation.controller

import com.example.genericjpa.implementation.model.Asset
import com.example.genericjpa.implementation.service.AssetService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assets")
class AssetController(val service: AssetService){

    @GetMapping
    fun get(): Collection<Asset> {
        return service.read()
    }

    @GetMapping(path = ["/{id}"])
    fun get(@PathVariable id: Long): Asset? {
        return service.read(id)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody Asset: Asset): Asset {
        return service.create(Asset)
    }

    @PutMapping
    fun update(@RequestBody Asset: Asset): Asset? {
        return service.update(Asset)
    }

    @DeleteMapping(path = ["/{id}"])
    fun delete(@PathVariable id: Long): Boolean {
        return service.delete(id)
    }
}