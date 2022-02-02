package com.example.genericjpa.implementation.model

import com.example.genericjpa.logic.model.Item
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
open class Asset(
    @Id
    override val id: Long,
    override val name: String,
    override val serial: String,
    val category: AssetCategory
) : Item<Long> {
}