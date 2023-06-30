package Java_Automation.Domaci

public class Zadatak2 {
    public static void main(String[] args) {

        Converter converter = new Converter(1000, Currency.EUR);
        converter.convert();

        converter.setCurrency(Currency.USD);
        converter.convert();

        converter.setCurrency(Currency.AUD);
        converter.convert();

        converter.setCurrency(Currency.CAD);
        converter.convert();

        converter.setCurrency(Currency.RUB);
        converter.convert();

        converter.setCurrency(Currency.GBP);
        converter.convert();

    }
}
