package com.example.genericjpa.implementation.model

import com.example.genericjpa.logic.model.Item
import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
open class Inventory(
    @Id
    override val id: String,
    override val name: String,
    override val serial: String,
    val category: InventoryCategory,
    val price: BigDecimal,
    val cost: BigDecimal
) : Item<String> {
}