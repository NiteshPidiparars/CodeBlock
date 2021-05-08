class TwinPrimes
{
    public static void main(String[]args)
    {
        String PrimeNo="";
        int i,j=0,LastPrime=1;
        System.out.println("Twins Prime are: ");
        for(i=1;i<100;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                PrimeNo+=i+" ";
                if((i-LastPrime)==2){
                    System.out.println("("+(i-2)+","+i+")");
                }
                LastPrime=i;
            }
        }
        System.out.println("Prime Number are: "+PrimeNo);
    }
}
