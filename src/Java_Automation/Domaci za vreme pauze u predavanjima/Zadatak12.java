package Java_Automation.Domaci

import java.util.Scanner;

public class Zadatak12 {
    /*
    12.	Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25 unete sa tastature.
    Kada korisnik unese 25 zavrsava se program. (while petlja).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int broj = 0;
        while (broj != 25) {
            System.out.print("Unesite broj od 1 do 25: ");
            broj = sc.nextInt();

            if (broj <= 25) {
                System.out.print("Parni brojevi od 1 do " + broj + " su: ");
                for (int i = 2; i <= broj; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                System.out.println("Uneli ste broj veci od 25!");
            }
        }
        System.out.println("Kraj programa!");
            }
        }

