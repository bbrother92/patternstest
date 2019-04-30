package com.company.factorymethod;

public class MilanStore extends PizzaStore {


    @Override
    public Pizza createPizza() {
        return new SimplePizza();
    }
}
