package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak20 {
    /*
    20.	Kreirati metodu koja računa proizvod dva broja, vraća rezultat u main, duplira i ispisuje.
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int a = sc.nextInt();

        System.out.print("Unesite drugi broj: ");
        int b = sc.nextInt();

        dupliProizvod(a, b);
    }

    public static void dupliProizvod(int a, int b) {
        int product = a * b;
        int doubledProduct = product * 2;
        System.out.println("Proizvod: " + product);
        System.out.println("Dupli proizvod: " + doubledProduct);
    }
}
