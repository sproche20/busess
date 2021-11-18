package com.bus.buses
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BusesApplication

fun main(args: Array<String>) {
	runApplication<BusesApplication>(*args)
}
