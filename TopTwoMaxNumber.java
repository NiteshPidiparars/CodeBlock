class TopTwoMaxNumber
{
    public void printTwoMaxNumber(int []nums)
    {
        int maxOne=0;
        int maxTwo=0;
        for(int n:nums){
            if(maxOne<n){
                maxTwo=maxOne;
                maxOne=n;
            }
            else if(maxTwo<n){
                maxTwo=n;
            }
        }
        System.out.println("First max Number is: "+maxOne);
        System.out.println("Second max Number is: "+maxTwo);
    }
    public static void main(String[]args)
    {
        int []num={65,34,27,8,33,10,89,45};
        TopTwoMaxNumber ttmn=new TopTwoMaxNumber();
        ttmn.printTwoMaxNumber(num);
    }
}
