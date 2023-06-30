package Java_Automation.Domaci

public class Zadatak2 {
    /*
    Napraviti metodu koja ispisuje tekst i prihvata kao parametre dva String-a.
    Ispis je u sledećem formatu: “Ime: “ text1 “i Prezime: “ text 2. text1 treba da budu sva velika slova,
    dok text2 treba da budu sva mala slova.
    U main metodi ispisati sa println nekoliko primera kako bi ste testirali (2-3 poziva je dovoljno)
     */
    public static void main(String[] args) {

        imeIPrezime("Zaklina", "Balevic");
        imeIPrezime("Milan", "Jovanovic");
        imeIPrezime("Jelena", "Markovic");
    }

    public static void imeIPrezime(String ime, String prezime) {
        String imeVelikaSlova = ime.toUpperCase();
        String prezimeMalaSlova = prezime.toLowerCase();
        System.out.println("Ime: " + imeVelikaSlova + " Prezime: " + prezimeMalaSlova);
    }

}

