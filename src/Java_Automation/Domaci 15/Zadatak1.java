package Java_Automation.Domaci

public class Zadatak1 {
    /*
    Napisati klasu radnik koja ima atribute ime, prezime i godinu zaposlenja.
    Napraviti metodu koja proverava da li je zaposlen u firmi duze od 10 godina
     (parametar metode).
     U main metodi napraviti 3 radnika i za svakog ispisati da li radnik
     radi više od 10 godina u firmi,
     */
    public static void main(String[] args) {
        Radnik radnik1 = new Radnik("Milan", 2003, "Milanovic");
        Radnik radnik2 = new Radnik("Marija", 1997, "Maric");
        Radnik radnik3 = new Radnik("Zaklina", 2020, "Balevic");

        System.out.println("Da li " + radnik1.ime + " radi vise od 10 godina: " + radnik1.getEmploymentStatusOver10Years());
        System.out.println("Da li " + radnik2.ime + " radi vise od 10 godina: " + radnik2.getEmploymentStatusOver10Years());
        System.out.println("Da li " + radnik3.ime + " radi vise od 10 godina: " + radnik3.getEmploymentStatusOver10Years());
    }
}
