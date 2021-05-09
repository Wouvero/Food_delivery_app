package Projekt;

public abstract class Produkt{
    protected String nazov;
    protected String druh;
    protected double cena;
    protected Restauracia restauracia;

    public Produkt(String nazov, String druh, double cena) {
        this.nazov = nazov;
        this.druh = druh;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public abstract void nastavRestauraciu(Restauracia restauracia);

    public abstract void zobrazInfo();
}
