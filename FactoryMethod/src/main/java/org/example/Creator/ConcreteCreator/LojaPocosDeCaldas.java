package org.example.Creator.ConcreteCreator;

import org.example.Creator.LojaPizza;
import org.example.Product.Pizza;
import org.example.Product.ConcreteProduct.PocosMarguerita;
import org.example.Product.ConcreteProduct.PocosMussarela;

public class LojaPocosDeCaldas extends LojaPizza {
    @Override
    public Pizza criarPizza(String tipo) {
        if (tipo.equals("mussarela")) {
            return new PocosMussarela();
        } else if (tipo.equals("marguerita")) {
            return new PocosMarguerita();
        } else {
            return null;
        }
    }
}
