package BoxingMatch;

public class Figther {
    String name;
    int damage;
    int weigth;
    int health;
    int dodge;

    Figther(String name, int damage, int weigth, int health, int dodge) {
        this.name = name;
        this.damage = damage;
        this.weigth = weigth;
        this.health = health;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Figther foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if (isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        if ((foe.health - this.damage) < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
