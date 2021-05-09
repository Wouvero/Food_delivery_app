package Projekt.Produkty;

import Projekt.Produkt;
import Projekt.Restauracia;

import java.util.Objects;

public class Pitie extends Produkt {
    protected double objem;

    public Pitie() {
        this(null, null,0,0);
    }

    public Pitie(String nazov, String druh, double cena, double objem) {
        super(nazov, druh, cena);
        this.objem = objem;
    }

    @Override
    public void zobrazInfo() {
        System.out.println("Toto je pitie");
    }

    @Override
    public void nastavRestauraciu(Restauracia restauracia) {
        this.restauracia = restauracia;
    }

    @Override
    public String toString() {
        return "Pitie{" + "nazov='" + nazov + '\'' + ", druh='" + druh + '\'' + ", cena=" + cena + ", objem=" + objem + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pitie){
            Pitie p = (Pitie) obj;
            return super.nazov.equals(p.nazov)
                    && super.druh.equals(druh)
                    && super.cena == p.cena
                    && this.objem == p.objem;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.nazov, super.druh, super.cena, this.objem);
    }
}
