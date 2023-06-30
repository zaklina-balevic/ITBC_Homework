package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
       	Sa do while petljom uraditi sumu brojeva koje korisnik unese.
        Minimum jedan broj mora da se unese (to do while svakako obezbedjuje).
         Program ispisuje koja je suma kada upisete 0 ili negativan broj
         */
        Scanner input = new Scanner(System.in);

        int zbir = 0;
        int n = 0;

        do {
            System.out.println("Unesite broj: ");
            n = input.nextInt();
            if(n > 0) {
                zbir = zbir + n;
            }
        } while (n > 0);

        System.out.println("Zbir unetih brojeva je: " + zbir);
    }
}
