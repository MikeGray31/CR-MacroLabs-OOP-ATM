import java.util.ArrayList;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {
    public static void main(String[] args){

        System.out.println("Please select the action you would like to take:\n\n");
        String s = "";
        MainMenuFunctions userList = new MainMenuFunctions();

        while(!s.equals("3")){
            System.out.println("1. Login\n" +
                    "2. Create Account\n" +
                    "3. Exit Application\n");

            s = Console.getStringInput(": ");
            switch (s) {
                case "1":
                    int login;
                    login = userList.loginCheck();
                    userList.login(login);
                    break;
                case "2":
                    userList.createUser();
                    //userList;
                    break;
                case "3":
                    break;
            }
        }

    }




}
