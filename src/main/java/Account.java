

public class Account {

    //fields --------------------------------------------------
    private float balance;
    private String type;

    //constructor ---------------------------------------------
    public Account(float initialDeposit, String type){
        this.balance = initialDeposit;
        this.type = type;
    }

    //deposit method ------------------------------------------
    public void deposit(float amount){
        balance += amount;
    }

    //withdrawal method ---------------------------------------
    public void withdraw(float amount){
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





    //getters and setters--------------------------------------
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
