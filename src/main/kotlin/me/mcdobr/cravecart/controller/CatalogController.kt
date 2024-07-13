package me.mcdobr.cravecart.controller

import me.mcdobr.cravecart.vo.ProductOffer
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/catalogs")
class CatalogController {
    @GetMapping("/{restaurant-id}")
    fun findCatalogSummaries(@PathVariable("restaurant-id") restaurantId: Long): Array<ProductOffer> {
        return emptyArray();
    }
}