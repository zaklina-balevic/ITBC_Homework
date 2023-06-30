package Java_Automation

import java.util.Scanner;

public class Zadatak2 {
    /*
    2.	Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();

        int max = Math.max(a, b);

        System.out.println("Broj koji je veci je: " + max);

        sc.close();

    }
}
