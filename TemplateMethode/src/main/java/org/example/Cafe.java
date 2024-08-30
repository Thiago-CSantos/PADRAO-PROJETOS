package org.example;

public class Cafe  extends Bebida{
    @Override
    public void infusao() {
        System.out.println("Colocar o café na água");
    }

    @Override
    public void adcionarCondimentos() {
        System.out.println("Adicionar açúcar");
    }

}
