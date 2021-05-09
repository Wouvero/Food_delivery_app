package Projekt.Produkty;

import Projekt.Produkt;
import Projekt.Restauracia;

import java.util.Objects;

public class Jedlo extends Produkt{
    protected int gramaz;

    public Jedlo() {
        this(null, null,0,0);
    }

    public Jedlo(String nazov, String druh, double cena, int gramaz) {
        super(nazov, druh, cena);
        this.gramaz = gramaz;
    }

    @Override
    public void nastavRestauraciu(Restauracia restauracia) {
        this.restauracia = restauracia;
    }

    @Override
    public void zobrazInfo(String stav) {
        System.out.println("[" + stav + "] " + "jedlo - [" + super.nazov + "]");
    }

    @Override
    public String toString() {
        return "Jedlo{" + "nazov='" + nazov + '\'' + ", druh='" + druh + '\'' + ", cena=" + cena + ", gramaz=" + gramaz + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Jedlo){
            Jedlo j = (Jedlo) obj;
            return super.nazov.equals(j.nazov)
                    && super.druh.equals(druh)
                    && super.cena == j.cena
                    && this.gramaz == j.gramaz;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.nazov, super.druh, super.cena, this.gramaz);
    }
}
