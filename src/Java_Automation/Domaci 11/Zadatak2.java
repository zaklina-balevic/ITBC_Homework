package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        2.	Pomocu while petlje, korisnik neprestano unosi brojeve i oni se sabiraju.
         Kada korisnik upise 0, program ispisuje sumu prethodno unetih brojeva i program se zavrsava.
         */

        Scanner input = new Scanner(System.in);

        int n = 1;
        int zbir = 0;
        while (n != 0){
                System.out.println("Unesite broj: ");
                n = input.nextInt();
                zbir= zbir + n;}

        System.out.println("Zbir brojeva je: " + zbir);
    }
}
