package com.builder;

import com.builder.pizzaBuilder.Pizza;

public class Main {
    public static void main(String[] args) {

        Person person = new Person.Builder().name("Tuğrul").surname("Bayrak").address("Türkiye").build();
        System.out.println(person);

        Pizza pizza = new Pizza.PizzaBuilder(32, "deneme-pizza").withOptionalBacon(false).withOptionalCheese(true).buildPizza();
        System.out.println(pizza.toString());
    }
}
