package org.example.creator;

import org.example.product.Transport;

public abstract class CreatorLogistics {

    public Transport planDelivery() {
        Transport t = createTransport();
        t.deliver();
        return t;
    }

    public abstract Transport createTransport();

}
