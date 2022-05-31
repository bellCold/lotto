package bitgame;

public class Magician extends Human {
    Magician(String name, String job, double hp, double mp) {
        super(name, job, hp, mp);
    }

    void magicLight() {
        System.out.println("빛 마법을 사용합니다.");
    }

    void magicFire() {
        System.out.println("불 마법을 사용합니다.");
    }
}
