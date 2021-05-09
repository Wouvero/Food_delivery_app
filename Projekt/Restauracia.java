package Projekt;

import Projekt.Informacie.Adresa;
import Projekt.Informacie.Kontakt;
import Projekt.Vynimky.ObjednavkaExceptions;
import Projekt.Vynimky.ProduktExceptions;

import java.util.*;

public class Restauracia {
    private String nazovRestauracie;
    private Adresa adresa;
    private Kontakt kontakt;
    private Set<Produkt> ponukaProduktov;
    private List<Objednavka> objednavky;

    public Restauracia(String nazovRestauracie, Adresa adresa, Kontakt kontakt) {
        this.nazovRestauracie = nazovRestauracie;
        this.adresa = adresa;
        this.kontakt = kontakt;
        ponukaProduktov = new HashSet<>();
        objednavky = new ArrayList<>();
    }

    public void pridajProduktDoPonuky(Produkt produkt){
        ponukaProduktov.add(produkt);
        produkt.nastavRestauraciu(this);
        produkt.zobrazInfo("PRIDANE");
    }

    public void odstranProduktZPonuky(Produkt produkt) throws ProduktExceptions {
        if(ponukaProduktov.contains(produkt)){
            ponukaProduktov.remove(produkt);
            produkt.zobrazInfo("PRIDANE");
        }else{
           throw new ProduktExceptions("Dani produkt nieje v ponuke.", produkt);
        }
    }

    public void pridajObjednavku(Objednavka objednavka){
        objednavky.add(objednavka);
    }

    public void odstranObjednavku(Objednavka objednavka) throws ObjednavkaExceptions {
        if(objednavky.contains(objednavka)){
            objednavky.remove(objednavka);
            System.out.println("Objednavka bola odstranena z ponuky");
        }
        else{
            throw new ObjednavkaExceptions("Objednavka nieje v zozname objednavok", objednavka);
        }
    }

    public void zmenStavObjednavky(Objednavka objednavka, String stav){
        Iterator iterator = objednavky.iterator();
        while(iterator.hasNext()){
            Objednavka obj = (Objednavka) iterator.next();
            if(obj.equals(objednavka)){
                obj.zmenStavObjednavky(stav);
            }
        }
    }

    public Set zobrazProdukty(){
        return ponukaProduktov;
    }

    public List zobrazObjednavky(){
        return objednavky;
    }

    @Override
    public String toString() {
        return "Restauracia {" + "nazovRestauracie='" + nazovRestauracie + '\'' + ", adresa=" + adresa + ", kontakt=" + kontakt + '}';
    }
}
