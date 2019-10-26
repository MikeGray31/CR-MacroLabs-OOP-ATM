

public class Account {

    private float balance;
    private String type;

    public Account(float initialDeposit, String type){
        this.balance = initialDeposit;
        this.type = type;
    }

    public void deposit(float amount){

    }



    
    //getters and setters
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
