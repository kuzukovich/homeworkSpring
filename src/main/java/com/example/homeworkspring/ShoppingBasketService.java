package com.example.homeworkspring;

import java.util.ArrayList;
import java.util.Map;

public interface ShoppingBasketService {
    void addItemShoppingBasket(ArrayList<Integer> id);

    Map<Integer, Integer> getShoppingBasket();

}
