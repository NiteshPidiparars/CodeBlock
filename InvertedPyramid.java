class InvertedPyramid
{
    public static void main(String[]args)
    {
        int i,j,k=0;
        for(i=5;i>=1;i--){
            for(j=1;j<=k;j++){
                System.out.println(" ");

                for(j=1;j<=i;j++)
                    System.out.println(j);

                for(j=i-1;j>=1;j--)
                    System.out.println(j);
                System.out.println();
                k++;
            }
        }
    }
}
