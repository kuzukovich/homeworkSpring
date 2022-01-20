package com.example.homeworkspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class Config {
    @Bean
    @SessionScope
    public ShoppingBasket newShoppingBasket() {
        return new ShoppingBasket();
    }

}
