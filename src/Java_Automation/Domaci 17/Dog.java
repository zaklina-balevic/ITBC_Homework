package Java_Automation.Domaci

public class Dog extends Animal {

    /*
    Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy”
      u zavisnosti od toga da li je promenljiva goodBoy true ili false.
        u klasi pas da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode).
        U konkretnim klasama implementirati metodu za zvuk koji životinja pravi,
          za psa “woof”.
     */

    private boolean goodBoy;


    public Dog(String name, String nickname, boolean goodBoy) {
        super(name, nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public String goodBoyStatus() {
        if (goodBoy) {
            return "I am a good boy";
        } else {
            return "I am a bad boy";
        }
    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public String toString() {
        return super.toString() + " - " + goodBoyStatus();
    }

}

