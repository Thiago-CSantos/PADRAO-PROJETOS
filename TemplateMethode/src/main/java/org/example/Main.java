package org.example;

public class Main {
    public static void main(String[] args) {

        // template methode

        Bebida cafe = new Cafe();
        Bebida cha = new Cha();

        System.out.println("Fazer café");
        cafe.prepare();

        System.out.println("Fazer chá");
        cha.prepare();

    }
}