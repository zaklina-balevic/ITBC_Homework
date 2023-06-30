package Java_Automation.Domaci

public abstract class Animal {
    /*
    	Napraviti apstraktnu klasu koja će da predstavlja životinju.
     životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
     */
    protected String name;
    protected String nickname;

    public abstract String makeSound();

    public Animal() {
    }


    public Animal(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return name + " (" + nickname + ") says: " + makeSound();
    }
}
