package me.mcdobr.cravecart.cart

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class CartApplication

fun main(args: Array<String>) {
    runApplication<CartApplication>(*args)
}