class DiamondPettern
{
    public static void main(String[]args)
    {
        int i,j,sp,n=21;
        sp=n/2;
        for(i=1;i<=n;i+=2){
            for(j=1;j<=sp;j++)
                System.out.print("  ");
            for(j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
            sp--;
        }
        sp+=2;
        for(i=n-2;i>=1;i-=2){
            for(j=1;j<=sp;j++)
                System.out.print("  ");
            for(j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
            sp++;
        }
    }
}
