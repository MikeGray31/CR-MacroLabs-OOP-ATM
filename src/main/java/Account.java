import java.util.ArrayList;

public class Account {

    //fields --------------------------------------------------
    private double balance;
    private String type;

    ArrayList <String> transactionHistory = new ArrayList<String>();

    //constructor ---------------------------------------------
    public Account(Double initialDeposit, String type){
        this.balance = initialDeposit;
        this.type = type;
    }

    //deposit method ------------------------------------------
    public void deposit(Double amount){
        this.balance += amount;
        transactionHistory.add(String.format("Deposited %.2f\n balance: %.2f\n", amount, this.getBalance()));
    }

    //withdrawal method ---------------------------------------
    public void withdraw(Double amount){
        if (amount > balance){
            System.out.println("Withdrawal requested exceeds account's current balance.");
        }
        else{
            this.balance -= amount;
        }
        transactionHistory.add(String.format("Withdrew %.2f\n balance: %.2f\n", amount, this.getBalance()));
    }

    //print history method ------------------------------------
    public void printHistory(){
        System.out.println("********** Transaction History **********" + "\n");
        for(int i = 0; i < transactionHistory.size(); i++){
            System.out.println("Balance: $ " + transactionHistory.get(i) + "\n");
        }
        System.out.println("********** End of Transactions **********");
    }



    //getters and setters--------------------------------------
    public double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
