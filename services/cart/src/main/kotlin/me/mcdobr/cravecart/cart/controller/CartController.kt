package me.mcdobr.cravecart.cart.controller

import me.mcdobr.cravecart.cart.vo.Cart
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/carts/{cart-id}")
class CartController {
    @GetMapping
    fun findCart(): Cart {
        return Cart();
    }
}