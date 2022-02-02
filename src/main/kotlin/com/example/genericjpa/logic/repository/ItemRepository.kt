package com.example.genericjpa.logic.repository

import com.example.genericjpa.logic.model.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository<ITEM: Item<ID>, ID: Any>: JpaRepository<ITEM, ID> {
}