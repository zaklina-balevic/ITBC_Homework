package Java_Automation.Domaci

import javax.swing.*;

public class Zadatak1 {
    /*
        Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a.
        Metoda vraća true samo ako su ta dva integer-a jedan za drugim, na primer 16 17 ili 24 25.
        U main metodi ispisati sa println nekoliko primera kako bi ste testirali (4-5 poziva je dovoljno)1.

     */
    public static void main(String[] args) {

        System.out.println(jedanZaDrugim(14, 15));
        System.out.println(jedanZaDrugim(23, 24));
        System.out.println(jedanZaDrugim(181, 188));
        System.out.println(jedanZaDrugim(62, 63));
        System.out.println(jedanZaDrugim(77, 79));

    }

    public static boolean jedanZaDrugim(int a, int b) {

        if (b == a + 1) {
            return true;
        }
        return false;
    }
}
