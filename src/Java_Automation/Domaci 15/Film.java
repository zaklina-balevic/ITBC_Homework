package Java_Automation.Domaci

public class Film {
    /*
    Napraviti klasu film koja ima atribute ime, režiser i godina
     objave.
     */
    String ime;
    String reziser;
    int godinaObjave;

    public Film() {
    }

    public Film(String ime, int godinaObjave, String reziser) {
        this.ime = ime;
        this.reziser = reziser;
        this.godinaObjave = godinaObjave;
    }

}
