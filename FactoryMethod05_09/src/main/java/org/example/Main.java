package org.example;

import org.example.creator.ConcreteCreator;
import org.example.creator.CreatorLogistics;
import org.example.product.Transport;

public class Main {
    public static void main(String[] args) {
        CreatorLogistics c = new ConcreteCreator();

        Transport p = c.factoryMethod();
        p.print();

    }
}