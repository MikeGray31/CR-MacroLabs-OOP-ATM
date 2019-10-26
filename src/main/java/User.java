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
        System.out.println("Welcome %s. What would you like to do:\n\n" +
                "1. Make a deposit\n" +
                "2. Make a withdrawal\n" +
                "3. Make a transfer\n" +
                "4. Open a new account" +
                "5. Check account balances" +
                "6. Exit");

        String s = Console.getStringInput(": ");

        switch (s) {

            case "1":

                break;

            case "2":

                break;

            case "3":

                break;

            case "4":
                break;

            case "5":
                break;

            case "6": break;

            default: break;
        }
    }


    public void createAccount(){
        Integer s = 0;
        double initial;
        while(s != 4){

            s = Console.getIntegerInput("What type of account do you want to create? \n" +
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
}
