package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak7 {
    /*
    7.	Napisati program koji ce da nađe proizvod
    prirodnih brojeva unetih sa tastature od a do b djeljivih sa 5 i koliko ih ima.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();

        int proizvod = 1;
        int brojac = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                proizvod *= i;
                brojac++;
            }
        }

        System.out.println("Proizvod: " + proizvod);
        System.out.println("Broj djeljivih sa 5: " + brojac);

        sc.close();
    }
}
