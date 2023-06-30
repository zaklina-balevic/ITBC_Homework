package Java_Automation.Domaci

import java.util.ArrayList;

public class Zadatak1 {
    /*
    1.	Napraviti apstraktnu klasu koja će da predstavlja životinju.
     životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
     Napraviti klase pas i mačka koje nasleđuju životinju.
     Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy”
      u zavisnosti od toga da li je promenljiva goodBoy true ili false.
      Mačka ima atribut za težinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk”
      u zavisnosti da li je težina preko 5kg.
      U obe klase implementirati toString, gde u oba slučaja se ispisuje ime i nadimak.
      U klasi mačka dodati na toString da ispisuje još da li je chonk ili nije,
       a u klasi pas da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode).
        U konkretnim klasama implementirati metodu za zvuk koji životinja pravi,
        za mačku da vraća string “meow” a za psa “woof”. I poziv te metode dodati u toString.
         U main metodi napraviti nekoliko mačaka i pasa. Staviti ih u listu i kroz petlju proći sve elemente,
          za pse ispisati “dog: “ i dodati od psa toString a ako je mačka napisati “cat: “ i isto toString.
          Za ovo koristite instanceof.
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky", "Luck", true);
        Dog dog2 = new Dog("Leonardo", "Leo", false);
        Dog dog3 = new Dog("Reginald", "Rex", true);

        Cat cat1 = new Cat("Lucifer", "Lucy", 12);
        Cat cat2 = new Cat("Simba", "Kitty", 4);
        Cat cat3 = new Cat("Garfield", "Ginger", 11);

        ArrayList<Animal> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);

        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Dog) {
                System.out.println("dog: " + animal.toString());
            } else if (animal instanceof Cat) {
                System.out.println("cat: " + animal.toString());
            }
        }
    }
}