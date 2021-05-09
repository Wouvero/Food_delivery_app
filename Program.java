import Projekt.*;
import Projekt.Builder.AdresaBuilder;
import Projekt.Builder.KontaktBuilder;
import Projekt.Builder.RestauraciaBuilder;
import Projekt.Builder.ZakaznikBuilder;
import Projekt.Informacie.Adresa;
import Projekt.Informacie.Kontakt;
import Projekt.Vynimky.ObjednavkaExceptions;
import Projekt.Vynimky.ProduktExceptions;
import Projekt.factory.ProduktFactory;

import java.util.List;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws ProduktExceptions, ObjednavkaExceptions {
        //Zakaznik 1
        Adresa adresaZakaznika1 = new AdresaBuilder().setMesto("Presov").setPSC("08001").setUlica("Popradska").setCisloDomu("5").getAdresa();
        Kontakt kontaktZakaznika1 = new KontaktBuilder().setEmail("patrik.vymysleny@gmail.com").setTelefon("0917 098 356").getKontakt();
        Zakaznik zakaznik1 = new ZakaznikBuilder().setMeno("Patrik").setPriezvisko("Vymysleny").setAdresa(adresaZakaznika1).setKontakt(kontaktZakaznika1).getZakaznik();

        //Zakaznik 2
        Adresa adresaZakaznika2 = new AdresaBuilder().setMesto("Presov").setPSC("08001").setUlica("Laca Novomestkeho").setCisloDomu("9a").getAdresa();
        Kontakt kontaktZakaznika2 = new KontaktBuilder().setEmail("tomas.zabudlivy@gmail.com").setTelefon("0949 097 176").getKontakt();
        Zakaznik zakaznik2 = new ZakaznikBuilder().setMeno("Tomas").setPriezvisko("Zabudlivy").setAdresa(adresaZakaznika1).setKontakt(kontaktZakaznika1).getZakaznik();


        //Vytvorenie restauracie
        Adresa pizzaLeone_adresa = new AdresaBuilder().setMesto("Presov").setPSC("08001").setUlica("Pavla Horova").setCisloDomu("20").getAdresa();
        Kontakt pizzaLeone_Kontakt = new KontaktBuilder().setEmail("pizzaleone@gmail.com").setTelefon("0949 429 392").getKontakt();
        Restauracia pizzaLeone = new RestauraciaBuilder().setNazovRestauracie("Pizza Leone").setAdresa(pizzaLeone_adresa).setKontakt(pizzaLeone_Kontakt).getRestauracia();

        //naplnenie restauracie produktami
        ProduktFactory produktF = new ProduktFactory();

        Produkt produkt1 = produktF.getInstance("Jedlo","pizza Margarita"      , "pizza" , 4.50, 450);
        Produkt produkt2 = produktF.getInstance("Jedlo","pizza Caprese"        , "pizza" , 5.50, 450);
        Produkt produkt3 = produktF.getInstance("Jedlo","pizza Quatro formaggi", "pizza" , 6.00, 450);
        Produkt produkt4 = produktF.getInstance("Jedlo","pizza Capri"          , "pizza" , 5.80, 450);
        Produkt produkt5 = produktF.getInstance("Jedlo","pizza Diavola"        , "pizza" , 5.50, 450);
        Produkt produkt6 = produktF.getInstance("Jedlo","pizza Salmone"        , "pizza" , 8.00, 450);
        Produkt produkt7 = produktF.getInstance("Jedlo","pizza Esotika"        , "pizza" , 5.00, 450);
        Produkt produkt8 = produktF.getInstance("Jedlo","pizza Rustica"        , "pizza" , 5.50, 450);
        Produkt produkt9 = produktF.getInstance("Jedlo","pizza Carbonara"      , "pizza" , 5.80, 450);
        Produkt produkt10 = produktF.getInstance("Pitie","Pomelo Grep"          , "pivo nealko", 0.99, 0.5);
        Produkt produkt11 = produktF.getInstance("Pitie","Kofola"               , "nealko", 1.50, 0.5);
        Produkt produkt12 = produktF.getInstance("Pitie","Pilsner"               , "pivo alko", 1.50, 0.5);


        pizzaLeone.pridajProduktDoPonuky(produkt1);
        pizzaLeone.pridajProduktDoPonuky(produkt2);
        pizzaLeone.pridajProduktDoPonuky(produkt3);
        pizzaLeone.pridajProduktDoPonuky(produkt4);
        pizzaLeone.pridajProduktDoPonuky(produkt5);
        pizzaLeone.pridajProduktDoPonuky(produkt6);
        pizzaLeone.pridajProduktDoPonuky(produkt7);
        pizzaLeone.pridajProduktDoPonuky(produkt8);
        pizzaLeone.pridajProduktDoPonuky(produkt9);
        pizzaLeone.pridajProduktDoPonuky(produkt10);
        //pizzaLeone.pridajProduktDoPonuky(produkt11);
        pizzaLeone.pridajProduktDoPonuky(produkt12);

        //Vytvorenie objednavky
        Objednavka pizzaLeone_Objednavka_1 = new Objednavka(zakaznik1, pizzaLeone);
        Objednavka pizzaLeone_Objednavka_2 = new Objednavka(zakaznik2, pizzaLeone);

        //naplnenie objednavky polozkami
        Polozka polozka1 = new Polozka(produkt1, 2);
        Polozka polozka2 = new Polozka(produkt2, 2);
        Polozka polozka3 = new Polozka(produkt10, 4);

        Polozka polozka4 = new Polozka(produkt5, 2);
        Polozka polozka5 = new Polozka(produkt12, 1);

        pizzaLeone_Objednavka_1.pridajPolozkuDoObjednavky(polozka1);
        pizzaLeone_Objednavka_1.pridajPolozkuDoObjednavky(polozka2);
        pizzaLeone_Objednavka_1.pridajPolozkuDoObjednavky(polozka3);

        pizzaLeone_Objednavka_2.pridajPolozkuDoObjednavky(polozka4);
        pizzaLeone_Objednavka_2.pridajPolozkuDoObjednavky(polozka5);

        pizzaLeone.pridajObjednavku(pizzaLeone_Objednavka_1);
        pizzaLeone.pridajObjednavku(pizzaLeone_Objednavka_2);

        System.out.println("\n");

            zobrazPolozky(pizzaLeone);

        System.out.println("\n");

        zobrazObjednavky(pizzaLeone);

        //vymazanie produktu z ponuky
        //odstranProdukt(pizzaLeone, produkt11);
        //odstranProdukt(pizzaLeone, produkt10);

        //odstranenie objednavky
        //odstranObjednavku(pizzaLeone, pizzaLeone_Objednavka_1);
        //odstranObjednavku(pizzaLeone, pizzaLeone_Objednavka_1);
        //zobrazObjednavky(pizzaLeone);

        pizzaLeone.zmenStavObjednavky(pizzaLeone_Objednavka_1, "PRIJATE");
        System.out.println(pizzaLeone_Objednavka_1.toString());
    }

    static void zobrazPolozky(Restauracia restauracia){
        Set ponuka = restauracia.zobrazProdukty();

        for( Object produkt : ponuka){
            System.out.println(produkt.toString());
        }
    }

    static void zobrazObjednavky(Restauracia restauracia){
        List<Objednavka> li = restauracia.zobrazObjednavky();

        for( Object objednavka : li){
            System.out.println(objednavka.toString());
        }
    }

    static void odstranProdukt(Restauracia restauracia ,Produkt produkt){
        try {
            restauracia.odstranProduktZPonuky(produkt);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void odstranObjednavku(Restauracia restauracia ,Objednavka objednavka){
        try {
            restauracia.odstranObjednavku(objednavka);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
