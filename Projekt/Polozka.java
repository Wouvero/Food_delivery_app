package Projekt;

public class Polozka {
    private Objednavka objednavka;
    private Produkt produkt;
    private int mnozstvo;
    private double cena;

    public Polozka(Produkt produkt, int mnozstvo) {
        this.produkt = produkt;
        this.mnozstvo = mnozstvo;
        this.cena = (double) this.mnozstvo * produkt.getCena();
    }

    public void nastavObjednavku(Objednavka objednavka){
        this.objednavka = objednavka;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Polozka {" + "produkt=" + produkt + ", mnozstvo=" + mnozstvo + ", cena=" + cena + '}';
    }
}
