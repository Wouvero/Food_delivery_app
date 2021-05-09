package Projekt.Informacie;

public class Adresa {
    private String ulica;
    private String cisloDomu;
    private String mesto;
    private String PSC;

    public Adresa(String ulica, String cisloDomu, String mesto, String PSC) {
        super();
        this.ulica = ulica;
        this.cisloDomu = cisloDomu;
        this.mesto = mesto;
        this.PSC = PSC;
    }

    @Override
    public String toString() {
        return "Adresa{" + "ulica='" + ulica + '\'' + ", cisloDomu='" + cisloDomu + '\'' + ", mesto='" + mesto + '\'' + ", PSC=" + PSC + '}';
    }
}
