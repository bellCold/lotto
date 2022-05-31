package bitbank;

public class Money extends Bank {

    public void inputMoney(int Money) {
        if (Money < 0) {
            System.out.println("제대로된 금액을 입력해주세요.");
        } else {
            System.out.println(Money + "원이 입금되었습니다.\n현재잔고 : " + (Money + accBalance));
            accBalance += Money;
        }
    }

    public void getMoney(int Money) {
        if (Money > accBalance) {
            System.out.println("잔고의 금액을 초과하였습니다.\n출금가능금액 : " + accBalance);
        } else {
            System.out.println(Money + "원이 출금되었습니다.\n현재잔고 : " + (accBalance - Money));
            accBalance -= Money;
        }
    }

    public void putMoney() {
        System.out.println("현재 잔고 : " + accBalance);
    }


}
