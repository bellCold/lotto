package bitgame;

public class Human {
    String name;
    String job;
    double hp;
    double mp;

    Human(String name, String job, double hp, double mp) {
        this.name = name;
        this.job = job;
        this.hp = hp;
        this.mp = mp;
    }

    void playerName() {
        System.out.println("플레이어 이름은 : " + this.name + "입니다.");
    }

    void playerHp(){
        System.out.println(this.name + "(" + this.job + ")" + " 님의 기본 체력은 " + this.hp + "입니다.");
    }

    void playerMp() {
        System.out.println(this.name + "(" + this.job + ")" + " 님의 기본 미력은 " + this.mp + "입니다.");
    }

    void playerWalk() {
        System.out.println(this.name + "(" + this.job + ")" + "걷습니다.");
    }

    void playerRun() {
        System.out.println(this.name + "(" + this.job + ")" + "걷습니다.");
    }

    void playerDeath() {
        System.out.println(this.name + "죽었습니다.");
    }
}
