class MaskedPettern
{
    public static void main(String[]args)
    {
        int i,j,k,d;
        for(i=1,d=4;i<=4;i++,d++){
            for(j=1,k=i;j<=i;j++,k+=d){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
