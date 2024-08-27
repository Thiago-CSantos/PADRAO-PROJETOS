package org.example;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("WALKING Strategy: " + a + " and " + b);
    }
}
