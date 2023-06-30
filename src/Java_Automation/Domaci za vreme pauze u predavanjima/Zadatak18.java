package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak18 {
    /*
    18.	Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b). Main poziva metod povrsina(a,b)
     i ispisuje površine pravougaonika. Pozvati 3 puta metod sa razlicitim vrednostima.
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu pravougaonika: ");
        int a = sc.nextInt();
        System.out.println("Unesite sirinu pravougaonika: ");
        int b = sc.nextInt();

        int povrsina = povrsina(a, b);
        System.out.println("Povrsina pravougaonika je: " + povrsina);

////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Unesite duzinu pravougaonika: ");
        int c = sc.nextInt();
        System.out.println("Unesite sirinu pravougaonika: ");
        int d = sc.nextInt();

        int povrsina2 = povrsina(c, d);
        System.out.println("Povrsina pravougaonika je: " + povrsina2);

////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Unesite duzinu pravougaonika: ");
        int e = sc.nextInt();
        System.out.println("Unesite sirinu pravougaonika: ");
        int f = sc.nextInt();

        int povrsina3 = povrsina(e, f);
        System.out.println("Povrsina pravougaonika je: " + povrsina3);

////////////////////////////////////////////////////////////////////////////////////////////////
        sc.close();
    }

    public static int povrsina(int a, int b) {

        return a * b;
    }
}

