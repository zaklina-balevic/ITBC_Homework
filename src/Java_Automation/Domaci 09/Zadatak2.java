package Java_Automation.Domaci;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        uraditi konverziju celzijusa u farenhajte.
        Korisnik unosi preko skenera temperaturu za celzijus u celobrojnoj vrednosti
        i program ispisuje oba u formatu "31C = 87.8F", zaokruziti farenhajte na jednu decimalu.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite temperaturu u celzijusima: ");
        int tempC = input.nextInt();

        double tempF = (tempC * 1.8) + 32;
        System.out.printf("%dC = %.1fF", tempC, tempF );

        input.close();
    }
}
