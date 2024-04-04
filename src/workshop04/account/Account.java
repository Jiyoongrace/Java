package workshop04.account;

public class Account {

    // field
    private String account;
    private int balance;
    private double interestRate;

    // constructor
    public Account() {
    }

    public Account(String account, int balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // getter & setter

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // method
    public double calculateInterest() {
        return this.getBalance() * interestRate;
    }

    public void deposit(int money) {
        this.setBalance(this.getBalance()+money);
    }

    public void withdraw(int money) {
        this.setBalance(this.getBalance()-money);
    }

    public void accountInfo() {
        System.out.print("계좌번호: " + this.getAccount()
                + " 잔액: " + this.getBalance()
                + " 이자율: " + String.format("%.1f", this.getInterestRate()*100) + "%");
    }
}
