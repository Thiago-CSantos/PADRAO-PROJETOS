package org.example;

import org.example.Creator.ConcreteCreator.LojaPocosDeCaldas;
import org.example.Creator.ConcreteCreator.LojaSaoJoao;
import org.example.Creator.LojaPizza;
import org.example.Product.Pizza;

public class Main {
    public static void main(String[] args) {
        LojaPizza lojaSJ = new LojaSaoJoao();
        LojaPizza lojaPocos = new LojaPocosDeCaldas();

        Pizza pizza = lojaSJ.orderPizza("mussarela");
        System.out.println("Thiago comprou a pizza " + pizza.getNome() + "\n");

        pizza = lojaPocos.orderPizza("marguerita");
        System.out.println("\n Ariel comprou a pizza " + pizza.getNome() + "\n");
    }
}