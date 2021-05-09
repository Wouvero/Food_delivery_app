package Projekt.Builder;

import Projekt.Informacie.Adresa;
import Projekt.Informacie.Kontakt;
import Projekt.Zakaznik;

public class ZakaznikBuilder {
    private String meno;
    private String priezvisko;
    private Adresa adresa;
    private Kontakt kontakt;

    public ZakaznikBuilder setMeno(String meno) {
        this.meno = meno;
        return this;
    }

    public ZakaznikBuilder setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
        return this;
    }

    public ZakaznikBuilder setAdresa(Adresa adresa) {
        this.adresa = adresa;
        return this;
    }

    public ZakaznikBuilder setKontakt(Kontakt kontakt) {
        this.kontakt = kontakt;
        return this;
    }

    public Zakaznik getZakaznik(){
        return new Zakaznik(meno, priezvisko, adresa, kontakt);
    }
}
