package bitgame;

public class Warrior extends Human {
    Warrior(String name, String job, double hp, double mp) {
        super(name, job, hp, mp);
    }
    void knifeAttack() {
        System.out.println("칼을 휘두릅니다.");
    }
    void shield() {
        System.out.println("방패로 막습니다.");
    }
}
