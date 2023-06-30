package Java_Automation.Domaci

import java.util.ArrayList;

public class Zadatak2 {
    /*
Napraviti klasu koja predstavlja računar.
Računar ima broj procesora, količinu ram memorije i količinu memorije.
Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana
i enum za tastaturu (da li je internacionalna ili US). Isto implementirati toString,
samo dodati još veličinu ekrana i tastaturu kao:
"Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja
za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
Implementirati toString metodu da ispisuje
"Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu
kojoj objekat pripada (Da li je laptop ili mobilni)
     */
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop(4, 16, 512, 15.6, Keyboard.INTERNATIONAL);
        MobilePhone mobilePhone1 = new MobilePhone(8, 6, 128, 32, Network._5G);

        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(laptop1);
        computers.add(mobilePhone1);

        for (int i = 0; i < computers.size(); i++) {
            Computer computer = computers.get(i);
            if (computer instanceof Laptop) {
                System.out.println("Laptop: " + computer);
            } else if (computer instanceof MobilePhone) {
                System.out.println("Mobile phone: " + computer);
            }
        }
    }
}
