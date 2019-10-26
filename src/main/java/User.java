

public class User {

    private String name;
    private String iD;
    private String password;
    private float balance;


    public User(String name, String iD, String password, float balance){
        this.name = name;
        this.iD = iD;
        this.password = password;
        this.balance = balance;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getiD() {
        return iD;
    }

    public String getPassword() {
        return password;
    }

    public float getBalance() {
        return balance;
    }
}
