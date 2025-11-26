package Team.ControlAccount;

public class AccountFormat {
    private String accountNumber;
    private String accountName;
    private int money;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money += money;
    }
    public void set2Money(int money) {
        this.money -= money;
    }
}