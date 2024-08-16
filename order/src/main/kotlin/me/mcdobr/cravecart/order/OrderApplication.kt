package me.mcdobr.cravecart.order

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class CraveCartApplication

fun main(args: Array<String>) {
	runApplication<CraveCartApplication>(*args)
}
