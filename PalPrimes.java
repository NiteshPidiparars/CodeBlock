class PalPrimes
{
    public static void main(String[]args)
    {
        int count=1;
        System.out.println("Palindrome Prime are: ");
        for(int i=2;;i++){
            if((isPrime(i))&&(isPalindrome(i))){
                System.out.print(i+"");
                if(count%10==0){
                    System.out.println();
                }
                if(count==20){
                    break;
                }
                count++;
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if((n==1)||(n==2)){
            return true;
        }
        else
        {
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    static int reversal(int n)
    {
        int result=0;
        while(n!=0){
            int lastDigits=n%10;
            result=result+lastDigits;
            n=n/10;
        }
        return result;
    }
   static boolean isPalindrome(int num)
    {
        return num==reversal(num);
    }
}
