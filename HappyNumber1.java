class HappyNumber1
{
    static int numSquareSum(int n)
    {
        int SquareSum=0;
        while(n>0){
            SquareSum+=(n%10)*(n%10);
            n=n/10;
        }
        return SquareSum;
    }
    static boolean isHappyNumber(int n)
    {
        int slow,fast;
        slow=fast=n;
        do{
            slow=numSquareSum(slow);
            fast=numSquareSum(numSquareSum(fast));
        }while(slow!=fast);
        return (slow==1);
    }
    public static void main(String[]args)
    {
        int n=13;
        if(isHappyNumber(n))
            System.out.println("its HappyNumber ");
        else
            System.out.println("its not HappyNumber ");
    }
}
