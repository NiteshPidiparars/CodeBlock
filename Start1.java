class Start1
{
    public static void main(String[]args)
    {
        int i,j,k;
        for(i=1;i<=5;i++){
                k=0;
            for(j=1;j<=9;j++){
                k=k+1;
                if(j>=i&&j<=10-i){
                    System.out.print(k);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
