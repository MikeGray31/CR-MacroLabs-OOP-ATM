import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private ArrayList<Account> accounts;

    public User(String User, String password){
        this.userName = User;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public void UserMenu(){
        String s = " ";
        System.out.println(String.format("Welcome, %s",this.userName));

        while(s != "exit"){
            System.out.println("What would you like to do?\n" +
                    "1. Deposit\n" +
                    "2. Withdrawal\n" +
                    "3. Transfer\n" +
                    "4. Check account balances\n" +
                    "5. Open a new account\n" +
                    "6. Delete an account\n" +
                    "7. Logout");
            s = Console.getStringInput(": ");
            switch (s) {
                case "1":
                    this.selectAccount("Select the account you would like to deposit into: ").deposit(Console.getDoubleInput("Deposit amount: "));
                    break;
                case "2":
                    this.selectAccount("Select the account you would like to withdraw from: ").withdraw(Console.getDoubleInput("Withdrawal amount: "));
                    break;
                case "3":
                    this.transfer();
                    break;
                case "4":
                    this.listAccounts();
                    break;
                case "5":
                    this.openAccount();
                    break;
                case "6":
                    this.deleteAccount();
                    break;
                case "7":
                    s = "exit";
                    break;
                default: break;
            }
        }
    }

    public void transfer(){
        Account a = this.selectAccount("Select the account to transfer from: ");
        Account b = this.selectAccount("Select the account to transfer to: ");
        double transferAmount = Console.getDoubleInput("Amount to transfer: ");

        if(transferAmount > b.getBalance() || b.getBalance() == 0){
            System.out.println("Amount exceeds balance in " + a.getType());
        }
        else{
            a.withdraw(transferAmount);
            b.deposit(transferAmount);
        }
    }

    public Account selectAccount(String prompt){
        System.out.println(prompt);
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(String.format("%d %s : %.2f", i+1, this.accounts.get(i).getType(), this.accounts.get(i).getBalance()));
        }
        Account selected = accounts.get(Console.getIntegerInput(":")- 1);
        return selected;
    }

    public void listAccounts(){
        for(int i = 0; i < this.accounts.size(); i++){
            System.out.println(String.format("%s : %.2f",this.accounts.get(i).getType(), this.accounts.get(i).getBalance()));
        }
        Console.getStringInput("");
    }

    public void openAccount(){
        Integer s = 0;
        double initial;
        while(s != 4){

            s = Console.getIntegerInput("What type of account do you want to create?\n" +
                "1. Checking\n" +
                "2. Saving\n"+
                "3. Investment\n" +
                "4. Exit\n: ");
            switch (s){
                case 1:
                    initial =  Console.getDoubleInput("Initial deposit: ");
                    Account checking = new Account(initial, "Checking");
                    this.accounts.add(checking);
                    s = 4;
                    break;
                case 2:
                    initial =  Console.getDoubleInput("Initial deposit: ");
                    Savings savings = new Savings(initial, "Savings");
                    this.accounts.add(savings);
                    s = 4;
                   break;
                case 3:
                    initial =  Console.getDoubleInput("Initial deposit: ");
                    Investment investment = new Investment(initial, "Investment");
                    this.accounts.add(investment);
                    s = 4;
                    break;
                case 4:
                    s = 4;
                    break;
                default: break;
        }

        }

    }

    public void deleteAccount(){
        Account d = this.selectAccount("Select the account to delete: ");
        accounts.remove(d);
    }

    //Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
