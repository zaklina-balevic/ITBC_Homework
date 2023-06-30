package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Preko skenera uneti godinu, program treba da izracuna da li je godina prestupna.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Uneti godinu: ");
        int godina = input.nextInt();

        if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
            System.out.println("Godina " + godina + " je prestupna.");
        } else {
            System.out.println("Godina " + godina + " nije prestupna.");
        }

    }
}
