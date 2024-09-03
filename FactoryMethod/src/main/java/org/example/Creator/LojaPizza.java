package org.example.Creator;

import org.example.Product.Pizza;

public abstract class LojaPizza {

    public Pizza orderPizza(String tipo){
        Pizza pizza = criarPizza(tipo);

        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();

        return pizza;
    }

    public abstract Pizza criarPizza(String tipo);

}
