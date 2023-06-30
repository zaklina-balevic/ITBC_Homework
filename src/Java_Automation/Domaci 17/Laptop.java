package Java_Automation.Domaci

public class Laptop extends Computer {
    /*
Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana
i enum za tastaturu (da li je internacionalna ili US). Isto implementirati toString,
samo dodati još veličinu ekrana i tastaturu kao:
"Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"

     */

    private double screenSize;
    private Keyboard keyboard;

    public Laptop(int numberOfProcessors,int amountOfRAM, int amountOfMemory, double screenSize, Keyboard keyboard) {
        super(numberOfProcessors, amountOfRAM, amountOfMemory);
        this.screenSize = screenSize;
        this.keyboard = keyboard;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    @Override
    public String toString() {
        return super.toString() + ", " +
                "ekran: " + screenSize + ", " +
                 "tastatura: " + keyboard;

    }
}
