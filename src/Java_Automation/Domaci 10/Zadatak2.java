package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        Napraviti promenljive "username" i "password" i definisati neke vrednosti po zelji.
        Korisnik unosi preko skenera dve vrednosti koje bi trebale da predstavljaju username i password
         i program treba da ih uporedi.
         Ako su username i password tačni, ispisati "Uspešno ste se ulogovali",
          a ako je jedno od ta dva pogrešno ispisati istu poruku "Pogrešan username ili password".
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite username: ");
        String username = input.nextLine();

        System.out.println("Unesite password: ");
        String password = input.nextLine();

        if (username.equals("zaklinaB") && password.equals("ItBootcamp8!")){
            System.out.println("Uspešno ste se ulogovali");
        }else {
            System.out.println("Pogrešan username ili password");

        }
    }
}
