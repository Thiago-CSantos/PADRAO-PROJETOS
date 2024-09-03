package org.example.Product.ConcreteProduct;

import org.example.Product.Pizza;

public class PocosMussarela extends Pizza {
    public PocosMussarela(){
        nome = "Mussarela estilo Poçoes de caldas";
        massa = "Massa extra grossa";
        molho = "Molho tomate";
        temperatura = "200";

        cobertura.add("Pouco Queijo mussarela");
    }
}
