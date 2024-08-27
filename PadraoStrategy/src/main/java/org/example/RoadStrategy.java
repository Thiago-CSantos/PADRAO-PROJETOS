package org.example;

public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("ROAD Strategy: " + a + " and " + b);
    }
}
