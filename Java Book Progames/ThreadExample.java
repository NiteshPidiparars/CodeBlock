import java.util.*;
class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal = bal;
    }
    public boolean isSufficientBalance(int w)
    {
        if(bal>w)
            return true;
        else
            return false;
    }
    public void Withdraw(int w)
    {
        bal = bal - w;
        System.out.println("Withdraw money is : "+w);
        System.out.println("your sufficient Balance is : "+bal);
    }
}
class Customer implements Runnable
{
    private String name;
    private Account account;
    public Customer(Account account, String n)
    {
        this.account = account;
        this.name = n;
    }
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(name+" , Enter Amount to Withdraw: ");
        int amt = sc.nextInt();
        synchronized(account)
        {
            if(account.isSufficientBalance(amt))
            {
                System.out.println(name);
                account.Withdraw(amt);
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
        }
    }
}
public class ThreadExample
{
    public static void main(String[]args)
    {
        Account ac = new Account(1000);
        Customer c1 = new Customer(ac," Raj "),
        c2 = new Customer(ac," Simran ");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
