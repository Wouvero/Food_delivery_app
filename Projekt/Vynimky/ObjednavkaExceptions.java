package Projekt.Vynimky;

import Projekt.Objednavka;
import Projekt.Produkt;

public class ObjednavkaExceptions extends Exception{
    private Objednavka objednavka;

    public ObjednavkaExceptions(String sprava, Objednavka objednavka) {
        super(sprava);
        this.objednavka = objednavka;
    }

    public Objednavka getObjednavka(){return objednavka;}
}
