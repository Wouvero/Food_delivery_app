package Projekt;

import Projekt.Rozhrania.StavObjednavky;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Objednavka implements StavObjednavky {
    private Zakaznik zakaznik;
    private Restauracia restauracia;
    private String stav;
    private List zoznamPoloziek;
    private double celkovaCena;

    public Objednavka(Zakaznik zakaznik, Restauracia restauracia) {
        this.zakaznik = zakaznik;
        this.restauracia = restauracia;
        this.zoznamPoloziek = new ArrayList();
        this.stav = OBJEDNANE;
    }

    public void pridajPolozkuDoObjednavky(Polozka polozka){
        zoznamPoloziek.add(polozka);
        polozka.nastavObjednavku(this);
        celkovaCena += polozka.getCena();
    }

    public void odstranPolozkuZObjednavky(Polozka polozka) {
        zoznamPoloziek.remove(polozka);
    }

    public List getZoznamPoloziek(){
        return zoznamPoloziek;
    }

    public void zmenStavObjednavky(String stav){
        switch (stav){
            case "OBJEDNANE":
                this.stav = OBJEDNANE;
                break;
            case "PRIJATE":
                this.stav = PRIJATE;
                break;
            case "V_PROCESE":
                this.stav = V_PROCESE;
                break;
            case "DOKONCENA":
                this.stav = DOKONCENA;
                break;
            case "DORUCENA":
                this.stav = DORUCENA;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        String s = "Objednavka \n=>" + zakaznik + "\n=>" + restauracia + "\nstav=" + stav + "\n";
        if(zoznamPoloziek.size() != 0){
            s+= "----------Polozky---------\n";
            double celkovaCena = 0;

            Iterator iterator = zoznamPoloziek.iterator();
            while (iterator.hasNext()){
                Polozka polozka = (Polozka) iterator.next();
                s+= "--> " + polozka  + "\n";
                celkovaCena += polozka.getCena();
            }
            s+= "Celkova suma na zaplatenie: " + celkovaCena + "€\n";
        }

        return s;
    }
}
