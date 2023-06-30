package Java_Automation;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
         preko skenera uneti svoje ime i prezime (odvojeno) i godinu rodjenja,
         ispisati ime i prezime i koliko godina imate.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = input.nextLine();

        System.out.print("Unesite prezime: ");
        String prezime= input.nextLine();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodenja = input.nextInt();

        System.out.print("Unesite trenutnu godinu: ");
        int trenutnaGodina = input.nextInt();
        // drugi nacin: jer se u zadatku  ne trazi unos trenutne godine mi je:
        // int ukupnoGodina = 2023 - godinaRodjenja;

        int ukupnoGodina = trenutnaGodina - godinaRodenja;

        System.out.printf("\nIme: %s\nPrezime: %s\nGodine: %d", ime, prezime, ukupnoGodina);

        input.close();

    }
}
