package org.example.product;

import org.example.creator.CreatorLogistics;

public class SealLogistics extends CreatorLogistics {
    @Override
    public Transport createTransport() {
        return new ConcreteShip();
    }
}
