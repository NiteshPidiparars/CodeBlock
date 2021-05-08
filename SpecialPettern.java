class SpecialPettern
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=9;i+=2)
        {
            for(j=i;j<=9;j+=2)
                System.out.print(j+" ");
            for(j=1;j<i;j+=2)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
