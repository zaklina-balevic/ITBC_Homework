package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak17 {
    /*
    17.	Napisati program koji ce učitati elemente i naći najveći element niza.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite element niza: ");
            niz[i] = sc.nextInt();
        }

        int max = niz[0];

        for (int i = 1; i < n; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }

        System.out.println("Najveci element niza je: " + max);
        sc.close();
    }
}

