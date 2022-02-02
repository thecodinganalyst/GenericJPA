package com.example.genericjpa.logic.service

import com.example.genericjpa.logic.model.Item
import com.example.genericjpa.logic.repository.ItemRepository
import org.springframework.data.repository.findByIdOrNull

interface ItemService<ITEM: Item<ID>, ID: Any> {

    val repository: ItemRepository<ITEM, ID>

    fun create(item: ITEM): ITEM {
        return repository.save(item)
    }

    fun read(): Collection<ITEM> {
        return repository.findAll()
    }

    fun read(id: ID): ITEM? {
        return repository.findByIdOrNull(id)
    }

    fun exists(id: ID): Boolean {
        return repository.existsById(id)
    }

    fun update(item: ITEM): ITEM? {
        return if (exists(item.id)){
            repository.save(item)
        }else{
            null
        }
    }
    fun delete(id: ID): Boolean {
        return if (exists(id)){
            repository.deleteById(id)
            true
        }else{
            false
        }
    }
}