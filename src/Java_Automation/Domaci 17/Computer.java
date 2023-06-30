package Java_Automation.Domaci

public class Computer {
    /*
    Računar ima broj procesora, količinu ram memorije i količinu memorije.
    Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
     */

    private int numberOfProcessors;
    private int amountOfRAM;
    private int amountOfMemory;

    public Computer(int numberOfProcessors, int amountOfRAM, int amountOfMemory) {
        this.numberOfProcessors = numberOfProcessors;
        this.amountOfRAM = amountOfRAM;
        this.amountOfMemory = amountOfMemory;
    }

    public int getNumberOfProcessors() {
        return numberOfProcessors;
    }

    public void setNumberOfProcessors(int numberOfProcessors) {
        this.numberOfProcessors = numberOfProcessors;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    public int getAmountOfMemory() {
        return amountOfMemory;
    }

    public void setAmountOfMemory(int amountOfMemory) {
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    public String toString() {
        return "Broj procesora: " + numberOfProcessors + ", " +
                "ram: " + amountOfRAM + "GB" + ", " +
                "memorija: " + amountOfMemory + "GB";
    }
}
