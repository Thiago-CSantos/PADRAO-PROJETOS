package org.example;

// classe CONTEXTO
public class Navigaor {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String a, String b){
        strategy.buildRoute(a,b);
    }
}
