class Pettern4
{
    public static void main(String[]args)
    {
        int i,j,k;
        for(i=1;i<=4;i++){k=2;
            for(j=1;j<=5;j++){
                    if(j>=k-i||j<=k-5)
                System.out.print("*");
            else
                System.out.println();
        }
        System.out.println();
        }
    }
}
