package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak8 {

    /*
    8.	Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int k = sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        int n = sc.nextInt();

        int suma = 0;
        int brojac = 0;

        for (int i = k; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
                brojac++;
            }
        }

        if (brojac > 0) {
            double aritmetickaSredina = (double) suma / brojac;
            System.out.println("Aritmeticka sredina parnih brojeva: " + aritmetickaSredina);
        } else {
            System.out.println("Nema parnih brojeva u zadanom rasponu.");
        }
    }
}



