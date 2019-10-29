import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AccountTests {

    @Test
    public void depositTest(){
        Account account = new Account(0.00, "checking");
        System.out.print(account.getBalance());
        double expected = 10.00;
        account.deposit(10.00);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void depositTest2(){
        Account account = new Account(0.00, "checking");
        System.out.print(account.getBalance());
        double expected = 200.22;
        account.deposit(200.222);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void depositTest3(){
        Account account = new Account(10.00, "checking");
        System.out.print(account.getBalance());
        double expected = 10.00;
        account.deposit(0.00);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void withdrawalTest(){
        Account account = new Account(10.00, "checking");
        System.out.print(account.getBalance());
        double expected = 5.00;
        account.withdraw(5.00);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void withdrawalTest2(){
        Account account = new Account(50000.0, "savings");
        System.out.print(account.getBalance());
        double expected = 39500;
        account.withdraw(10500.0);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void withdrawalTest3(){
        Account account = new Account(123456.0, "savings");
        System.out.print(account.getBalance());
        double expected = 116666.5;
        account.withdraw(6789.50);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void checkHistory1(){
        Account account = new Account(10.00, "checking");
        account.deposit(10.00);
        account.deposit(11.00);
        ArrayList <String> history= account.transactionHistory;
        String expected = String.format("Deposited 10.00\n balance: 20.00\n");
        String actual = account.transactionHistory.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkHistory2(){
        Account account = new Account(10.00, "checking");
        account.deposit(10.00);
        account.deposit(11.00);
        ArrayList <String> history= account.transactionHistory;
        String expected = String.format("Deposited 11.00\n balance: 31.00\n");
        String actual = account.transactionHistory.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkHistory3(){
        Account account = new Account(10.00, "checking");
        account.deposit(10.00);
        account.deposit(11.00);
        account.withdraw(5.00);
        ArrayList <String> history= account.transactionHistory;
        String expected = String.format("Withdrew 5.00\n balance: 26.00\n");
        String actual = account.transactionHistory.get(2);

        Assert.assertEquals(expected, actual);
    }
}
