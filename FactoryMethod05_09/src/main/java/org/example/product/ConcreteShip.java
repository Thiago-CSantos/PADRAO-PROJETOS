package org.example.product;

public class ConcreteShip extends Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega por terra em caixa");
    }
}
