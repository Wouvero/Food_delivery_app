package Projekt;

import Projekt.Informacie.Adresa;
import Projekt.Informacie.Kontakt;

public class Zakaznik {
    private String meno;
    private String priezvisko;
    private Adresa adresa;
    private Kontakt kontakt;

    public Zakaznik(String meno, String priezvisko, Adresa adresa, Kontakt kontakt) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.adresa = adresa;
        this.kontakt = kontakt;
    }

    @Override
    public String toString() {
        return "Zakaznik {" + "meno='" + meno + '\'' + ", priezvisko='" + priezvisko + '\'' + ", adresa=" + adresa + ", kontakt=" + kontakt + '}';
    }
}
