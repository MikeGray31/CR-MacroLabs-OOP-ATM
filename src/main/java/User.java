

public class User {

    //fields --------------------------------------------------
    private double balance;
    private double balanceSave;
    private double balanceInvest;
    private String type;

    //constructor ---------------------------------------------
    public User(double initialDeposit, double initialSavings, double initialInvestment, String type){
        this.balance = initialDeposit;
        this.balanceSave = initialSavings;
        this.balanceInvest = initialInvestment;
        this.type = type;
    }

    // transfer funds methods ---------------------------------------
    public void transferSelfSaving(double amount, Account accountFrom, Account accountTo){
        double transferAmount = amount;
        double transferSum;

        if(transferAmount > 0) {
            this.balance -= amount;
            System.out.println("Your funds will transfer instantly.");
        }
        else{
            System.out.println("Your must enter an appropriate amount of funds to transfer.");
        }

        transferSum = balanceSave + transferAmount;
        System.out.println(String.format("Current balance in Savings %s: %.2f",type, transferSum));

    }

    public void transferSelfInvest(double amount, Account accountFrom, Account accountTo){
        double transferAmount = amount;
        double transferSum;

        if(transferAmount > 0) {
            this.balance -= amount;
            System.out.println("Your funds will transfer instantly.");
        }

        transferSum = balanceInvest + transferAmount;
        System.out.println(String.format("Current balance in Investment %s: %.2f",type, transferSum));

    }

    // transfer funds methods
    public void transferUser(double amount, User recipient){
        double transferAmount = amount;
        int rounterNumber = recipient.ROUTING_NUMBER;

        if(rounterNumber == ROUTING_NUMBER){
            System.out.println("Your funds will transfer instantly.");
        }
        else{
            System.out.println("Your funds will transfer in 2-3 business days.");
        }
        this.balance -= tranferAmount;
        recipient.balance += tranferAmount;
    }




    //getters and setters--------------------------------------
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
    public double getBalanceSave() {
        return balanceSave;
    }

    public void setBalanceSave(double balance) {

        this.balanceSave = balanceSave;
    }
    public double getBalanceInvest() {
        return balanceInvest;
    }

    public void setBalanceInvest(double balance) {

        this.balanceInvest = balanceInvest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
