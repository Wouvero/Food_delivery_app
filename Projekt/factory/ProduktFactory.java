package Projekt.factory;

import Projekt.Produkt;
import Projekt.Produkty.Jedlo;
import Projekt.Produkty.Pitie;

public class ProduktFactory {
    public Produkt getInstance(String str, String nazov, String druh, double cena, double hustota){
        if(str.equals("Jedlo")){
            return new Jedlo(nazov, druh,cena, (int) hustota);
        }else if(str.equals("Pitie")){
            return new Pitie(nazov, druh,cena, hustota);
        }else {
            return null;
        }
    }
}
