package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak15 {
    /*
    15.	Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.
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
        System.out.println("Elementi niza sa neparnim indeksom su: ");
        for (int i = 1; i < n; i += 2) {
            System.out.print(niz[i] + " ");
            }

        }
    }
