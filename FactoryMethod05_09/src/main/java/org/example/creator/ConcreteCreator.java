package org.example.creator;

import org.example.product.ConcreteShip;
import org.example.product.Transport;

public class ConcreteCreator extends CreatorLogistics {
    @Override
    public void someOperation() {

    }

    @Override
    public Transport factoryMethod() {
        return new ConcreteShip();
    }
}
