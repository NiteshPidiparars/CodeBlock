import java.rmi.*;
public class SimpleCalculator implements Calculator
{
    public int add(int a, int b) {
        System.out.println("Received : "+a+" and "+b);
        int result = a + b;
        System.out.println("Sent : "+result);
        return result;
    }
}
