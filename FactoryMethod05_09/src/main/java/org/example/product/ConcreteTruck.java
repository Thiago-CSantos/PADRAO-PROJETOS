package org.example.product;

public class ConcreteTruck extends Transport{
    @Override
    public void deliver() {
        System.out.println("Entrega por terra em uma caixa");
    }
}
