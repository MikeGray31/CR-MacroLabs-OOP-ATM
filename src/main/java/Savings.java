

public class Savings extends Account{

    private float balance;
    private String type;
    private float interestRate;
    private float interestDollars;
    private float intPercent;
    private float dollars;

    public Savings(){

    }

    public void deposit(float amount){

    }

//    public void interestRate(float intPercent){
//        this.intPercent = intPercent;
//
//    }

    public void interestDollar(float dollars){

      interestDollars = dollars * interestRate;


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

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestDollar() {
        return interestDollars;
    }

}
