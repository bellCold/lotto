package bitbank;

public abstract class Bank {
    String accNum, accName;
    int accBalance;

    public void putCusInfo() {
        System.out.println("계좌번호 : " + this.accNum);
        System.out.println("고객이름 : " + this.accName);
        System.out.println("현재잔액 : " + this.accBalance);
    }

    public String getAccNum() {
        return this.accNum;
    }

    public String getAccName() {
        return this.accName;
    }

    public int getAccBalance() {
        return this.accBalance;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccBalance(int accBalance) {
        if (accBalance < 0) {
            this.accBalance = 0;
            System.out.println("잘못된 금액입니다.");
            return;
        } else {
            this.accBalance = accBalance;
        }
    }

}
