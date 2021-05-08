import java.io.*;
class HappyNumber
{
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int n;
    HappyNumber()
    {
        n=0;
    }
    void getNum(int num)
    {
        n=num;
    }
    int sum_sq_digits(int x)
    {
        if(x==0)
            return 0;
        else
        {
            int d=x%10;
            return(d*d+sum_sq_digits(x/10));
        }
    }
    void isHappyNumber()
    {
        int a=sum_sq_digits(n);
        while(a>9){
            a=sum_sq_digits(a);
        }
        if(a==1)
            System.out.println(n+" is a HappyNumber");
        else
            System.out.println(n+" is not HappyNumber");
    }
    public static void main(String[]args)throws IOException
    {
        HappyNumber ob=new HappyNumber();
        System.out.println("Enter the number: ");
        int b=Integer.parseInt(bf.readLine());
        ob.getNum(b);
        ob.isHappyNumber();
    }
}
