package com.example.genericjpa.implementation.service

import com.example.genericjpa.implementation.model.Asset
import com.example.genericjpa.implementation.repository.AssetRepository
import com.example.genericjpa.logic.service.ItemService
import org.springframework.stereotype.Service

@Service
class AssetService(
    override val repository: AssetRepository
) : ItemService<Asset, Long> {
}