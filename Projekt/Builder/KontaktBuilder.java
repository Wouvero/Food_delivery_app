package Projekt.Builder;

import Projekt.Informacie.Kontakt;

public class KontaktBuilder {
    private String email;
    private String telefon;

    public KontaktBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public KontaktBuilder setTelefon(String telefon) {
        this.telefon = telefon;
        return this;
    }

    public Kontakt getKontakt(){
        return new Kontakt(email, telefon);
    }
}
