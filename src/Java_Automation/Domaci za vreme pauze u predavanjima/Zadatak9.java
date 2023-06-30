package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak9 {

    /*
    9.	Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj osoba: ");
        int n = sc.nextInt();

        int maxVisina = 0;
        int zbirVisina = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite visinu osobe: ");
            int visina = sc.nextInt();

            if (visina > maxVisina) {
               maxVisina = visina;
            }
            zbirVisina += visina;
        }
        double prosecnaVisina = (double) zbirVisina / n;
        System.out.println("Prosečna visina: " + prosecnaVisina);
        System.out.println("Najveća visina: " + maxVisina);

        sc.close();
    }

}
