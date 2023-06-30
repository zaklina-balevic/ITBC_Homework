package Java_Automation.Domaci

public class Zadatak2 {
    /*
    U main metodu napraviti dva različita filma i
     proveriti koji film je noviji.
     */
    public static void main(String[] args) {


        Film film1 = new Film("Guardians of the Galaxy Vol.3", 2023, "James Gunn");
        Film film2 = new Film("Iron Man", 2008, "Jon Favreau");

        if (film1.godinaObjave > film2.godinaObjave) {
            System.out.println(film1.ime + " " + film1.godinaObjave + " je noviji film od " + film2.ime + " " + film2.godinaObjave);
        } else if (film1.godinaObjave == film2.godinaObjave) {
            System.out.println(film1.ime + " " + film1.godinaObjave + "je izasao iste godine kao i " + film2.ime + " " + film2.godinaObjave);

        } else {
            System.out.println(film2.ime + " " + film2.godinaObjave + " je noviji film od " + film1.ime + " " + film1.godinaObjave);
        }
    }
}
