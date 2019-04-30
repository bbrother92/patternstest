package com.company.factorymethod;

public class NapoliStore extends PizzaStore {


    @Override
    public Pizza createPizza() {
        return new PizzaA();
    }
}
