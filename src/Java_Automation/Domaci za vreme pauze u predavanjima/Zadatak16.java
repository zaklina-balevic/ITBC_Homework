package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak16 {
    /*
    16.	Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite elemente niza: ");
            niz[i] = sc.nextInt();
        }

        System.out.println("Elementi niza u obrnutom redosledu su:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(niz[i] + " ");
        }
    }
}

