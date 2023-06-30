package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.
        Jarac: 22. decembar - 19. januar
        Vodolija: 20. januar - 18. februar
        Ribe: 19. februar - 20. mart
        Ovan: 21. mart - 19. april
        Bik: 20. april - 20. maj
        Blizanci: 21. maj - 20. jun
        Rak: 21. jun - 22. jul
        Lav: 23. jul - 22. avgust
        Devica: 23. avgust - 22. septembar
        Vaga: 23. septembar - 22. oktobar
        Škorpija: 23. oktobar - 21. novembar
        Strelac: 22. novembar - 21. decembar

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite dan rodjenja: ");
        int dan = input.nextInt();

        System.out.println("Unesite mesec rodjenja: ");
         String mesec = input.next().toLowerCase();


         int brojDana = 0;
         switch (mesec){
             case "januar":
             case "mart":
             case "maj":
             case "jul":
             case "avgust":
             case "oktobar":
             case "decembar":
                 brojDana = 31;
                 break;
             case "februar":
                 brojDana = 29;// da bi obuhvatili i prestupne godine
                 break;
             case "april":
             case "jun":
             case "septembar":
             case "novembar":
                 brojDana = 30;
                 break;
             default:
                 System.out.println("Uneli ste neispravan mesec.");
                 return;
                }
                if (dan < 1 || dan > brojDana) {
                    System.out.println("Uneli ste neispravan dan.");
                    return;
                }
                String horoskopskiZnak = "";

        switch (mesec) {
            case "januar":
                if (dan < 20) {
                    horoskopskiZnak = "Jarac";
                } else {
                    horoskopskiZnak = "Vodolija";
                }
                break;

            case "februar":
                if (dan < 19) {
                    horoskopskiZnak = "Vodolija";
                } else {
                    horoskopskiZnak = "Ribe";
                }
                break;

            case "mart":
                if (dan < 21) {
                    horoskopskiZnak = "Ribe";
                } else {
                    horoskopskiZnak = "Ovan";
                }
                break;

            case "april":
                if (dan < 20) {
                    horoskopskiZnak = "Ovan";
                } else {
                    horoskopskiZnak = "Bik";
                }
                break;

            case "maj":
                if (dan < 21) {
                    horoskopskiZnak = "Bik";
                } else {
                    horoskopskiZnak = "Blizanci";
                }
                break;

            case "jun":
                if (dan < 21) {
                    horoskopskiZnak = "Blizanci";
                } else {
                    horoskopskiZnak = "Rak";
                }
                break;

            case "jul":
                if (dan < 23) {
                    horoskopskiZnak = "Rak";
                } else {
                    horoskopskiZnak = "Lav";
                }
                break;

            case "avgust":
                if (dan < 23) {
                    horoskopskiZnak = "Lav";
                } else {
                    horoskopskiZnak = "Devica";
                }
                break;

            case "septembar":
                if (dan < 23) {
                    horoskopskiZnak = "Devica";
                } else {
                    horoskopskiZnak = "Vaga";
                }
                break;

            case "oktobar":
                if (dan < 23) {
                    horoskopskiZnak = "Vaga";
                } else {
                    horoskopskiZnak = "Skorpija";
                }
                break;

            case "novembar":
                if (dan < 22) {
                    horoskopskiZnak = "Skorpija";
                } else {
                    horoskopskiZnak = "Strelac";
                }
                break;

            case "decembar":
                if (dan < 22) {
                    horoskopskiZnak = "Strelac";
                } else {
                    horoskopskiZnak = "Jarac";
                }
                break;

            default:
                System.out.println("Uneli ste neispravan mesec.");
                return;
        }
        System.out.println("Vas horoskopski znak je " + horoskopskiZnak);


    }

}

