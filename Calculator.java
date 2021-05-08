import java.util.*;
import java.io.*;
class Calculator
{
    public static void main(String[]args)
    {
        int choice;
        int x=0,y=0,sum;
        PrintStream out;
        Scanner sc;
        Calculator cal=new Calculator();
        try
        {
            out=new PrintStream("calclog.txt");
            do{
                System.out.println("Calculator Program.");
                System.out.println("\n----------------------");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Divide");
                System.out.println("5.Mod");
                System.out.println("6.Power");
                System.out.println("99.End Program");
                sc=new Scanner(System.in);
                System.out.println("Enter your choice: ");
                choice=sc.nextInt();
                while((choice<1||choice>6)&&choice!=99){
                    System.out.println("Please. Enter number 1,2,3,4,5 or 6");
                    choice=sc.nextInt();
                }
                if(choice!=99){
                        System.out.println("Please. Enter 2 number: ");
                        x=sc.nextInt();
                        y=sc.nextInt();
                }
                switch(choice)
                {
                case 1:
                    sum=cal.add(x,y);
                    System.out.printf("The sum is %d\n\n",sum);
                    out.println(x+" + "+y+" = "+sum);
                    break;
                case 2:
                    sum=cal.sub(x,y);
                    System.out.printf("The sum is %d\n\n",sum);
                    out.println(x+" - "+y+" = "+sum);
                    break;
                case 3:
                    sum=cal.multi(x,y);
                    System.out.printf("The sum is %d\n\n",sum);
                    out.println(x+" * "+y+" = "+sum);
                    break;
                case 4:
                    sum=cal.div(x,y);
                    System.out.printf("The sum is %d\n\n",sum);
                    out.println(x+" / "+y+" = "+sum);
                    break;
                case 5:
                    try
                    {
                    sum=cal.mod(x,y);
                    System.out.printf("The sum is %d\n\n",sum);
                    out.println(x+" % "+y+" = "+sum);
                    }catch(Exception e){
                        System.out.println("Error. can't divided by zero");
                    }
                    break;
                case 6:
                    sum=cal.pow(x,y);
                    System.out.printf("The sum is %d\n\n",sum);
                    out.println(x+" ^ "+y+" = "+sum);
                    break;
                }
            }while(choice!=99);
            sc.close();
            System.out.println("Ending Program.......");
        }catch(Exception e)
        {
            System.out.println("Error Some error occur");
            e.printStackTrace();
        }
    }
    public int add(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
    }
    public int sub(int a,int b)
    {
        int sum;
        sum=a-b;
        return sum;
    }
    public int multi(int a,int b)
    {
        int sum;
        sum=a*b;
        return sum;
    }
    public int div(int a,int b)
    {
        int sum;
        sum=a/b;
        return sum;
    }
    public int mod(int a,int b)
    {
        int sum;
        sum=a%b;
        return sum;
    }
    public int pow(int base,int exp)
    {
        int sum=1;
        if(exp==0){
            sum=1;
        }
        while(exp>0){
            sum=sum*exp;
            exp--;
        }
        return sum;
    }
}
