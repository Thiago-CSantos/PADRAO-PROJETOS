package org.example.Creator.ConcreteCreator;

import org.example.Creator.LojaPizza;
import org.example.Product.Pizza;
import org.example.Product.ConcreteProduct.SJMarguerita;
import org.example.Product.ConcreteProduct.SJMussarela;

public class LojaSaoJoao extends LojaPizza {
    @Override
    public Pizza criarPizza(String tipo) {

        if (tipo.equals("mussarela")) {
            return new SJMussarela();
        } else if (tipo.equals("marguerita")) {
            return new SJMarguerita();
        } else {
            return null;
        }
    }
}
