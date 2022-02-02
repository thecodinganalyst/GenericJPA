package com.example.genericjpa.implementation.repository

import com.example.genericjpa.implementation.model.Asset
import com.example.genericjpa.logic.repository.ItemRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface AssetRepository: ItemRepository<Asset, Long> {
}