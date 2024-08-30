package org.example;

public abstract class Bebida {

    // template methode

    public void prepare(){
        ferverAqua();
        infusao();
        despejarNaXicara();
        adcionarCondimentos();
    }

    public void ferverAqua(){
        System.out.println("Ferver agua");
    }

    public abstract void infusao();

    public void despejarNaXicara(){
        System.out.println("Despejar a bebeida na xicara");
    }

    public abstract void adcionarCondimentos();


}
