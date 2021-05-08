class StringReverse
{
    public static void main(String[]args)
    {
        String str="abcdef";
        char c[]=str.toCharArray();
        System.out.println("Reverse String: ");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}
