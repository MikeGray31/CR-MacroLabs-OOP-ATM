import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Account account = new Account(50000, "savings");
        System.out.print(account.getBalance());
        double expected = 39500;
        account.withdraw(10500);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }

    @Test
    public void withdrawalTest3(){
        Account account = new Account(123456, "savings");
        System.out.print(account.getBalance());
        double expected = 116666.5;
        account.withdraw(6789.50);
        double actual = account.getBalance();


        Assert.assertEquals(expected, actual, 0.00);

    }
}
