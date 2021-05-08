class Start2
{
    public static void main(String[]args)
    {
        int i,j,sp=0;
        for(i=5;i>=0;i--){
            for(j=1;j<=sp;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print(j);
            for(j=i-1;j>=1;j--)
                System.out.print(j);
        System.out.println();
        sp++;
        }
    }
}

