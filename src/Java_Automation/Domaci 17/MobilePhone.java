package Java_Automation.Domaci

public class MobilePhone extends Computer {
    /*
Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja
za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
Implementirati toString metodu da ispisuje
"Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
     */

    private int cameraMegapixels;
    private Network network;

    public MobilePhone(int numberOfProcessors, int amountOfRAM, int amountOfMemory, int cameraMegapixels, Network network) {
        super(numberOfProcessors, amountOfRAM, amountOfMemory);
        this.cameraMegapixels = cameraMegapixels;
        this.network = network;
    }

    public int getCameraMegapixels() {
        return cameraMegapixels;
    }

    public void setCameraMegapixels(int cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "kamera: " + cameraMegapixels + "megapixels, " +
                "mreza: " + network;
    }
}