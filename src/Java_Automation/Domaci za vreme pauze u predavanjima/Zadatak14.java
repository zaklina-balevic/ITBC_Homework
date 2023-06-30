package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak14 {
    /*
    14.	Napisati program za ispis prirodnih brojeva od 1 do 17 koji nisu djeljivi sa proizvoljno unetim brojem.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 17; i++) {
            if (i % n != 0) {
                System.out.print(i + " ");
            }
        }
    }
}