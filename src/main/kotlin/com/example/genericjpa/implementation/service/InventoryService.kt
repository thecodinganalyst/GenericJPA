package com.example.genericjpa.implementation.service

import com.example.genericjpa.implementation.model.Inventory
import com.example.genericjpa.implementation.repository.InventoryRepository
import com.example.genericjpa.logic.service.ItemService
import org.springframework.stereotype.Service

@Service
class InventoryService(
    override val repository: InventoryRepository
): ItemService<Inventory, String> {
}