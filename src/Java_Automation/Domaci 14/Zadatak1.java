package Java_Automation.Domaci

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    /*
    Napraviti metodu koja ispisuje niz i kao parametre prihvata niz.
    Unutar metode pronaći najveću vrednost u nizu,
    a zatim tu vrednost postaviti kao vrednost svakog elementa u nizu.
    Koristiti scanner za popunjavanje početnog niza. (3-4 poziva dovoljno).
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] niz = new int[4];
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesi " + (i + 1) + ". element niza: ");
            niz[i] = s.nextInt();
        }
        najvecaVrednost(niz);

        s.close();
    }

    public static void najvecaVrednost(int[] niz) {

        Arrays.sort(niz);
        int najveciBroj = niz[niz.length - 1];
        System.out.println("Najveći broj: " + najveciBroj);

        Arrays.fill(niz, najveciBroj);
        System.out.println(Arrays.toString(niz));
    }
}

