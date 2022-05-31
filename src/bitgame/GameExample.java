package bitgame;

public class GameExample {
    public static void main(String[] args) {
        Magician magician = new Magician("kjc","magician", 300, 300);
        magician.playerName();
        magician.playerHp();
        magician.playerMp();
        magician.playerWalk();
        magician.playerRun();
        magician.playerDeath();
    }
}
