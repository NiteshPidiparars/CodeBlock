/* find the problem of bit shifting. */
import java.util.*;
public class BitShifting
{
    static void problem1()
    {
        int a=17,b=4;
        a = a>>b;
        a = a<<--a;
        System.out.println(a+" "+b);
    }
    static void problem2()
    {
        int a[] = {5,6,7,2,9,8,6};
        for(int i=0;i<4;i++){
            a[i+1] = (a[i]%2==0)? --a[i] : ++a[i];
            System.out.println(a[i]);
        }
    }
    public static void main(String[]args)
    {
        problem1();
    }
}
