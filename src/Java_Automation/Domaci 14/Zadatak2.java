package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak2 {
    /*
    Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
    Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
    a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
    U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu,
    i samu valutu kao string. Ispisati nekoliko primera poziva u main-u.
    Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dinari;
        do {
            System.out.print("Unesite iznos u dinarima: ");
            dinari = scanner.nextDouble();
            if (dinari <= 0) {
                System.out.println("Neispravan unos. Unesite broj veći od 0.");
            }
        } while (dinari <= 0);

        System.out.print("Unesite valutu (EUR, USD, GBP): ");
        String valuta = scanner.next();

        double konvertovaniIznos = konverzijaDinara(dinari, valuta);
        System.out.println("Konvertovani iznos: " + konvertovaniIznos + " " + valuta.toUpperCase());

//        Unesite iznos u dinarima: 5000
//        Unesite valutu (EUR, USD, GBP): EUR
//        Konvertovani iznos: 42.19 EUR
//
//        Unesite iznos u dinarima: 10000
//        Unesite valutu (EUR, USD, GBP): USD
//        Konvertovani iznos: 100.0 USD
//
//        Unesite iznos u dinarima: 25000
//        Unesite valutu (EUR, USD, GBP): GBP
//        Konvertovani iznos: 182.93 GBP

    }

    public static double konverzijaDinara(double dinari, String valuta) {
        double konvertovaniIznos = 0;

        switch (valuta.toUpperCase()) {
            case "EUR":
                konvertovaniIznos = dinari / 118.5;  // Konverzija iz dinara u euro
                break;
            case "USD":
                konvertovaniIznos = dinari / 100.0;  // Konverzija iz dinara u američki dolar
                break;
            case "GBP":
                konvertovaniIznos = dinari / 136.7;  // Konverzija iz dinara u britansku funtu
                break;
            default:
                System.out.println("Nepodržana valuta.");
        }

        return konvertovaniIznos;
    }
}
