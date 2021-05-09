package Projekt.Builder;

import Projekt.Informacie.Adresa;
import Projekt.Informacie.Kontakt;
import Projekt.Restauracia;

public class RestauraciaBuilder {
    private String nazovRestauracie;

    private Adresa adresa;
    private Kontakt kontakt;

    public RestauraciaBuilder setNazovRestauracie(String nazovRestauracie) {
        this.nazovRestauracie = nazovRestauracie;
        return this;
    }

    public RestauraciaBuilder setAdresa(Adresa adresa) {
        this.adresa = adresa;
        return this;
    }

    public RestauraciaBuilder setKontakt(Kontakt kontakt) {
        this.kontakt = kontakt;
        return this;
    }

    public Restauracia getRestauracia(){
        return new Restauracia(nazovRestauracie, adresa, kontakt);
    }
}
