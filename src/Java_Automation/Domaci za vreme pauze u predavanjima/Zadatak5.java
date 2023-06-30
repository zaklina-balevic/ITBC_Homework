package Java_Automation.Domaci

public class Zadatak5 {
    /*
    Napisati program koji sabira prirodne brojeve do 100
     */
    public static void main(String[] args) {
        int zbir = 0;

        for (int i = 0; i <= 100; i++) {
            zbir += i;

        }System.out.println("Zbir brojeva do 100 je: " + zbir);
    }
}
