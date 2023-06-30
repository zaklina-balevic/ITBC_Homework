package Java_Automation.Domaci

public class Converter {
    /*
    2.	Napraviti klasu Konverter koja kao atribute ima rsd i valutu. Valuta je enum, dok je rsd celi broj.
     Valuta treba da bude jedna od: EUR, USD, AUD, CAD, RUB i GBP.
     Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
     Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
      Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje.
      Pogledati kako se porede enum-i u javi najpravilnije.
      U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.
     */

    private int rsd;
    private Currency currency;

    private Converter (){

    }


    public Converter(int rsd, Currency currency) {
        this.rsd = rsd;
        this.currency = currency;

    }

    public void setRsd(int rsd) {

        this.rsd = rsd;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void convert() {

        double convertedAmount;
        switch (currency) {
            case EUR:
                convertedAmount = rsd / 117.6;
                System.out.println("Converted amount in EUR: " + convertedAmount);
                break;
            case USD:
                convertedAmount = rsd / 104.8;
                System.out.println("Converted amount in USD: " + convertedAmount);
                break;
            case AUD:
                convertedAmount = rsd / 76.7;
                System.out.println("Converted amount in AUD: " + convertedAmount);
                break;
            case CAD:
                convertedAmount = rsd / 82.2;
                System.out.println("Converted amount in CAD: " + convertedAmount);
                break;
            case RUB:
                convertedAmount = rsd / 1.4;
                System.out.println("Converted amount in RUB: " + convertedAmount);
                break;
            case GBP:
                convertedAmount = rsd / 145.7;
                System.out.println("Converted amount in GBP: " + convertedAmount);
                break;
            default:
                System.out.println("Invalid currency.");
        }


    }
}


