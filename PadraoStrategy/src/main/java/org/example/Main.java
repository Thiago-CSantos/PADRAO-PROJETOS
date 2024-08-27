package org.example;

// CLIENTE é a main
public class Main {
    public static void main(String[] args) {
        Navigaor navigaor = new Navigaor();

        navigaor.setStrategy(new RoadStrategy());
        navigaor.buildRoute("Local A", "Local B");

        navigaor.setStrategy(new WalkingStrategy());
        navigaor.buildRoute("Local A", "Local B");

    }
}