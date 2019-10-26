import java.util.ArrayList;

public class User {
    String userName;
    String password;
    ArrayList<Account> accounts;

    public User(String User, String password){
        this.userName = User;
        this.password = password;
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
                    accounts.add(checking);
                    s = 4;
                    break;
                case 2:
                    initial =  Console.getDoubleInput("Initial deposit: ");
                    Savings savings = new Savings(initial, "Savings");
                    accounts.add(savings);
                    s = 4;
                   break;
                case 3:
                    initial =  Console.getDoubleInput("Initial deposit: ");
                    Investment investment = new Investment(initial, "Investment");
                    accounts.add(investment);
                    s = 4;
                    break;
                case 4: break;
                default: break;
        }

        }

    }
}
