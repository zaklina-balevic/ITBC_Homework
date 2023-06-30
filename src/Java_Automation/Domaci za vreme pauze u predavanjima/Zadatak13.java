package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak13 {
    /*
    13.	Napisati program za ispis kvadrata prirodnih brojeva do n unetih sa tastature (while petlja).
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int kvadrat = i * i;
            System.out.println("Kvadrat broja " + i + " je " + kvadrat);
            i++;


        }
        sc.close();
    }
}
