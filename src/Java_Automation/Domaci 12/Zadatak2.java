package Java_Automation.Domaci

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        Kreirati niz proizvoljne duzine celobrojnih vrednosti
        i pomnoziti poslednji clan sa ukupnim brojem clanova (Koristiti .length, ne fiksnu vrednost)
         */

        int [] niz = new int[7];
        //int[] niz = {1, 2, 3, 4, 5, 6, 7};
        int product = 0;

        for (int i = 0; i < niz.length; i ++){

            product = niz[niz.length-1] * niz.length;
        }
        System.out.println(product);
    }
}
