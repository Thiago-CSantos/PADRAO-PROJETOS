package org.example.Product;

import java.util.ArrayList;

public abstract class Pizza {
    protected String nome;
    protected String massa;
    protected String molho;
    protected String temperatura;
    protected int tempo;
    ArrayList cobertura = new ArrayList();

    public void preparar() {
        System.out.println("Preparando " + nome);
        System.out.println("Amassando " + massa);
        System.out.println("Adicionando " + molho);
        System.out.println("Temperatura " + temperatura + "ºC");

        System.out.println("Adicionando cobertura: ");
        for (int i = 0; i < cobertura.size(); i++) {
            System.out.println(" " + cobertura.get(i));
        }
    }

    public void assar() {
        System.out.println("Assando por 5 minutos");
    }

    public void cortar() {
        System.out.println("Cortando a pizza em fatias diagonais");
    }

    public void embalar() {
        System.out.println("Colocando a pizza na caixa oficial da Pizzaria");
    }

    public String getNome() {
        return nome;
    }
}
