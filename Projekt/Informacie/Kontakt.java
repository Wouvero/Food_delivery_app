package Projekt.Informacie;

public class Kontakt {
    private String email;
    private String telefon;

    public Kontakt(String email, String telefon) {
        this.email = email;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Kontakt{" + "email='" + email + '\'' + ", telefon='" + telefon + '\'' + '}';
    }
}
