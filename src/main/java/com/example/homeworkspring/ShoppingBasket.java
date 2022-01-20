package com.example.homeworkspring;

import java.util.HashMap;


public class ShoppingBasket {
    private final HashMap<Integer, Integer> items;

    public ShoppingBasket() {
        this.items = new HashMap<>();
    }

    public HashMap<Integer, Integer> getItems() {
        return items;
    }
}
