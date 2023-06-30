package Java_Automation.Domaci

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        3.	Kreirati dva niza i prikazati koji niz ima vise clanova
        (Ne morate petlju koristiti vec mozete if statement)
         */

        int [] niz1 = new int[15];
        int [] niz2 =new int[27];

        if (niz1.length > niz2.length){

            System.out.println("Niz 1 ima više članova (" + niz1.length + ")"+
                    " od niza 2 koji ima (" + niz2.length + ") clanova");
        }
            else{
                System.out.println("Niz 2 ima više članova (" + niz2.length + ")"+
                        " od niza 1 koji ima (" + niz1.length + ") clanova");;
        }

    }
}
