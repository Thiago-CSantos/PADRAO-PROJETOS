package org.example;

public class Cha extends Bebida{

    @Override
    public void infusao() {
        System.out.println("Colocar o chá na água");
    }

    @Override
    public void adcionarCondimentos() {
        System.out.println("Adicionar limão");
    }
}
