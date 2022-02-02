package com.example.genericjpa.logic.model

interface Item <ID: Any>{
    val id: ID
    val name: String
    val serial: String
}