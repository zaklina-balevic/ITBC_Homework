package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak1 {
    /*
    1.	Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int a = sc.nextInt();

        int abs = Math.abs(a);

        System.out.println("Apsolutna vrednost broja " + a + " je: " + abs);

        sc.close();
    }

}
