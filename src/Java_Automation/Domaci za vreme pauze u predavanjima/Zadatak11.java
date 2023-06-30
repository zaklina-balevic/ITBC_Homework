package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak11 {
    /*
    11.	Napisati program koji ce nakon unosa sa tastature ispisati pravougaoni trougao kao na slici
     sa proizvoljnim brojem redova:
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite proizvoljni broj: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();


        }
    }
}
