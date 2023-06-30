package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak10 {
    /*
    10.	Napisati program koji ce nakon unosa sa tastature da ispisuje 3 puta u 3 reda IME sa razmakom.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = sc.nextLine();

        for ( int i = 0; i <3; i++){
            System.out.printf("%s %s %s%n", ime,ime,ime);
        }
    }
}
