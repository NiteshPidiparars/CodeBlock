import java.io.*;
class Swapping
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a=10;
        int b=15;
        System.out.println("Value Before Swapping: ");
        System.out.println("a= "+a+" and b= "+b);
        //method 1 using add and subtract
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("----------Using Method 1-------");
        System.out.println("a= "+a+" and b= "+b);
        //method 1 using XOR Operation
           a=10;
           b=15;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("----------Using Method 2-------");
        System.out.println("a= "+a+" and b= "+b);
        //method 1 using Multiplication and Division
           a=10;
           b=15;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("----------Using Method 3-------");
        System.out.println("a= "+a+" and b= "+b);
        //method 1 using One Formula to Swapping
           a=10;
           b=15;
        a=b-a+(b=a);
        System.out.println("----------Using Method 4-------");
        System.out.println("a= "+a+" and b= "+b);
    }
}
