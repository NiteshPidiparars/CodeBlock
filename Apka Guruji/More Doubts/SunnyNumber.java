/* Sunny Number :- A number that is one less than a perfect square.*/
import java.util.*;
public class SunnyNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        double r;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        r = Math.sqrt(n+1);
        if(r == Math.floor(r))
            System.out.println("It is Sunny Number.");
        else
            System.out.println("Not Sunny Number.");
    }
}
