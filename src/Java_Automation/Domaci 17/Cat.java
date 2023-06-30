package Java_Automation.Domaci

public class Cat extends Animal {
    /*
    Mačka ima atribut za težinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk”
      u zavisnosti da li je težina preko 5kg.
       U obe klase implementirati toString, gde u oba slučaja se ispisuje ime i nadimak.
      U klasi mačka dodati na toString da ispisuje još da li je chonk ili nije,
        U konkretnim klasama implementirati metodu za zvuk koji životinja pravi,
        za mačku da vraća string “meow”
     */

    private int weight;

    public Cat(String name, String nickname, int weight) {
        super(name, nickname);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String chonkStatus() {
        if (weight > 5) {
            return "I'm a chonk";
        } else {
            return "I'm not a chonk";
        }
    }


    @Override
    public String makeSound() {
        return "meow";
    }


    @Override
    public String toString() {
        return super.toString() + " - " + chonkStatus();
    }
}
