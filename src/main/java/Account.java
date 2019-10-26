

public class Account {

    //fields --------------------------------------------------
    private double balance;
    private String type;

    //constructor ---------------------------------------------
    public Account(double initialDeposit, String type){
        this.balance = initialDeposit;
        this.type = type;
    }

    //deposit method ------------------------------------------
    public void deposit(double amount){
        this.balance += amount;
    }

    //withdrawal method ---------------------------------------
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Withdrawal requested exceeds account's current balance.");
        }
        else{
            this.balance -= amount;
        }
    }

    //getters and setters--------------------------------------
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
