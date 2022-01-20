package com.example.homeworkspring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {
    private final ShoppingBasket shoppingBasket;

    public ShoppingBasketServiceImpl(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }


    public void addItemShoppingBasket(ArrayList<Integer> id) {
        List<Integer> listBasket = new ArrayList<Integer>(id);
        for (Integer idGoods : listBasket) {
            if (shoppingBasket.getItems().containsKey(idGoods)) {
                shoppingBasket.getItems().put(idGoods, shoppingBasket.getItems().get(idGoods) + 1);
            } else {
                shoppingBasket.getItems().put(idGoods, 1);
            }
        }
    }

    @Override
    public Map<Integer, Integer> getShoppingBasket() {
        return shoppingBasket.getItems();
    }


}
