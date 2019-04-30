package com.company;

import com.company.factorymethod.MilanStore;
import com.company.factorymethod.NapoliStore;
import com.company.factorymethod.PizzaStore;

public class Main {

    public static void main(String[] args) {
        /*
        * порождающий шаблон проектирования, предоставляющий подклассам (дочерним классам) интерфейс для создания
        * экземпляров некоторого класса. В момент создания наследники могут определить, какой класс создавать.
        * Иными словами, данный шаблон делегирует создание объектов наследникам родительского класса
        *
        * */
        PizzaStore[] list = {new MilanStore(),new NapoliStore()};
        for (PizzaStore pizzaStore : list) {
            pizzaStore.createPizza().eat();
        }



    }
}
