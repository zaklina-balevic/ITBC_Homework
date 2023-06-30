package Java_Automation.Domaci

public class Zadatak6 {
    /*
    6.	Napisati program koji ce prebrojati prirodne brojeve u intervalu od 1 do 50 koji su djeljivi sa 3.
     */

    public static void main(String[] args) {

        int zbir = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                zbir++;


            }

        }System.out.println("Brojeva deljivih sa 3 ima: " + zbir);
    }
}
