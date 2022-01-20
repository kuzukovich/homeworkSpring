package com.example.homeworkspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("order/")
public class ShoppingBasketController {
    private final ShoppingBasketService shoppingBasketService;

    public ShoppingBasketController(ShoppingBasketService shoppingBasketService) {
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping("/add")
    public void addItemShoppingBasket(@RequestParam ArrayList<Integer> id) {
        shoppingBasketService.addItemShoppingBasket(id);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getShoppingBasket() {
        return shoppingBasketService.getShoppingBasket();
    }
}
