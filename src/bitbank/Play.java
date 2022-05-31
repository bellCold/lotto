package bitbank;

public class Play {
    public static void main(String[] args) {
        Money money = new Money();
        money.setAccNum("1111-1111");
        money.setAccName("김종찬");
        money.setAccBalance(1000);
        money.putCusInfo();
        System.out.println("--------------------");

        /*  입금  */
        money.inputMoney(1000);
        System.out.println("--------------------");

        /*  출금  */
        money.getMoney(10000);

    }
}
