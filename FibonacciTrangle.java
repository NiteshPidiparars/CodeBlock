class FibonacciTrangle
{
    public static void main(String[]args)
    {
        int i,j,a,b,c;
        a=0;
        b=1;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
