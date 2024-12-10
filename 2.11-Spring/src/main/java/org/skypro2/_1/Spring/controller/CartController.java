package org.skypro2._1.Spring.controller;

import org.skypro2._1.Spring.service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer>ids) {
        return cartService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
