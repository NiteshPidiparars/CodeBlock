class SumOfStringNo
{
    public static void main(String[]args)
    {
        int sum=0;
        String str="sha12bhu467";
        str=str.replaceAll("\\D+","");
        System.out.println(str);
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            sum=sum+Character.getNumericValue(c[i]);
        }
        System.out.println("sum is: "+sum);
    }
}
