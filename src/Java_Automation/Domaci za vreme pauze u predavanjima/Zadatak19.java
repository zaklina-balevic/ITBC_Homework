package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak19 {
    /*
	Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature.
	Izvršiti dodeljivanje vrednosti metoda varijabli c.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int a = sc.nextInt();

        System.out.print("Unesite drugi broj: ");
        int b = sc.nextInt();

        int c = minimum(a, b);

        System.out.println("Minimum od " + a + " i " + b + " je " + c);

        sc.close();
    }

    public static int minimum(int a, int b) {
        return Math.min(a, b);
    }
}
