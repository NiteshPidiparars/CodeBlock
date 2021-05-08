import java.util.*;
class HarmonicSeries
{
    public static void main(String[]args)
    {
        int i=1,num;
        double rst=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for length of Series: ");
        num=sc.nextInt();
        while(i<=num){
            rst=rst+(double)1/i;
            i++;
        }
        System.out.println(rst+"\t");
    }
}

