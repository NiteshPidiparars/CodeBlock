import java.util.*;
class AutomorphicNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input=sc.nextInt();
        int square=input*input;
        String inputAsString=input+" ";
        String squareAsString=square+" ";
        if(squareAsString.endsWith(inputAsString))
            System.out.println(input+" is AutomorphicNumber");
        else
            System.out.println(input+" is not AutomorphicNumber");
    }
}
