package Projekt.Vynimky;

import Projekt.Produkt;

public class ProduktExceptions extends Exception{
    private Produkt produkt;
    public ProduktExceptions(String sprava, Produkt produkt) {
        super(sprava);
        this.produkt = produkt;
    }

    public Produkt getProdukt(){return produkt;}
}
