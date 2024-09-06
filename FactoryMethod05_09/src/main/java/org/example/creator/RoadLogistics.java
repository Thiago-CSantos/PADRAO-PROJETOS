package org.example.creator;

import org.example.product.ConcreteTruck;
import org.example.product.Transport;

public class RoadLogistics extends CreatorLogistics{
    @Override
    public Transport createTransport() {
        return new ConcreteTruck();
    }
}
