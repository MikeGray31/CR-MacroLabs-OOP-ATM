/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args){

        System.out.println("Please select the action you would like to take:\n\n" +
                "1. Login\n" +
                "2. Create Account\n" +
                "3. Exit Application\n");

        String s = Console.getStringInput(": ");

        switch (s) {

            case "1":
                break;

            case "2":
                createUser();
                break;

            case "3":
                break;

        }
    }

    public static void createUser(){

        String FirstName = Console.getStringInput("Enter your first name: ");
        String LastName = Console.getStringInput("Enter your last name: ");
        String username = Console.getStringInput("Enter a User Name: ");
        String pw = "";
        String pw2 = " ";
        while(!pw2.equals(pw)){
            pw = Console.getStringInput("Enter a password: ");
            pw2 = Console.getStringInput("Reenter password: ");
            if(!pw.equals(pw2)){ System.out.println("Passwords do not match. Please try again.");}
        }
        User user = new User(username, pw);
    }
}
