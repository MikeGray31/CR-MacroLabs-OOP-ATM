import java.util.ArrayList;

public class User {
    String userName;
    String password;
    ArrayList<Account> accounts;

    public User(String User, String password){
        this.userName = User;
        this.password = password;
    }

    public void UserMenu(){
        String s = " ";
        System.out.println("Welcome.");

        while(s != "6"){
            System.out.println("What would you like to do?\n" +
                    "1. Deposit\n" +
                    "2. Withdrawal\n" +
                    "3. Transfer\n" +
                    "4. Check account balances" +
                    "5. Open a new account\n" +
                    "6. Delete an account" +
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
                    Account a = this.selectAccount("Select the account to transfer from: ");
                    Account b = this.selectAccount("Select the account to transfer to: ");
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
                case "7": break;
                default: break;
            }
        }
    }

    public void transfer(){

    }

    public Account selectAccount(String prompt){
        System.out.println(prompt);
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(String.format("%d %s : %.2f", i+1, accounts.get(i).getType(), accounts.get(i).getBalance()));
        }
        return(accounts.get(Console.getIntegerInput(":")-1));

    }

    public void listAccounts(){
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(String.format("%s : %.2f",accounts.get(i).getType(), accounts.get(i).getBalance()));
        }
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
                case 4: break;
                default: break;
        }

        }

    }

    public void deleteAccount(){
        
    }
}
