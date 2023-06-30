package Java_Automation.Domaci

public class Radnik {

    String ime;
    String prezime;
    int godinaZaposlenja;

    public Radnik() {
    }

    public Radnik(String ime, int godinaZaposlenja, String lastName) {
        this.ime = ime;
        this.prezime = lastName;
        this.godinaZaposlenja = godinaZaposlenja;
    }

    public boolean getEmploymentStatusOver10Years() {
        int howManyYears = 2023 - this.godinaZaposlenja;
        return howManyYears > 10;
    }
}
