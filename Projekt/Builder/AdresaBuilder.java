package Projekt.Builder;

import Projekt.Informacie.Adresa;

public class AdresaBuilder {
    private String ulica;
    private String cisloDomu;
    private String mesto;
    private String PSC;

    public AdresaBuilder setUlica(String ulica) {
        this.ulica = ulica;
        return this;
    }

    public AdresaBuilder setCisloDomu(String cisloDomu) {
        this.cisloDomu = cisloDomu;
        return this;
    }

    public AdresaBuilder setMesto(String mesto) {
        this.mesto = mesto;
        return this;
    }

    public AdresaBuilder setPSC(String PSC) {
        this.PSC = PSC;
        return this;
    }

    public Adresa getAdresa(){
        return new Adresa(ulica, cisloDomu, mesto, PSC);
    }
}
