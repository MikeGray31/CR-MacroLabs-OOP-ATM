import java.util.ArrayList;

public class MainMenuFunctions {
    private ArrayList<User> userList = new ArrayList<>();

    public int loginCheck(){
        String user = Console.getStringInput("Username: ");
        String pw = Console.getStringInput("Password: ");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).getUserName());
            System.out.println(userList.get(i).getPassword());
            if (userList.get(i).getUserName().equals(user) && userList.get(i).getPassword().equals(pw)) {
                return i;
            }
        }
        return -1;
    }

    public void login(int l){
        userList.get(l).UserMenu();
    }

    public void createUser(){
//        String FirstName = Console.getStringInput("Enter your first name: ");
//        String LastName = Console.getStringInput("Enter your last name: ");
        String username = Console.getStringInput("Enter a User Name: ");
        String pw = "";
        String pw2 = " ";
        while(!pw2.equals(pw)){
            pw = Console.getStringInput("Enter a password: ");
            pw2 = Console.getStringInput("Reenter password: ");
            if(!pw.equals(pw2)){ System.out.println("Passwords do not match. Please try again.");}
        }
        User user = new User(username, pw);
        userList.add(user);

    }

}
