package com.example.genericjpa.implementation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenericJpaApplication

fun main(args: Array<String>) {
	runApplication<GenericJpaApplication>(*args)
}
