package org.example;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("PUBLIC TRANSPORT Strategy: " + a + " and " + b);
    }
}
