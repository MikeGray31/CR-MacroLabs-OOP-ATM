

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
        balance += amount;
    }

    //withdrawal method ---------------------------------------
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Withdrawal requested exceeds account's current balance.");
        }
        else{
            balance -= amount;
        }
    }

    //check balance method ------------------------------------
    public void checkBalance(){
        System.out.println(String.format("Current balance in %s: %.2f",type, balance));
    }

    // print transaction history




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
