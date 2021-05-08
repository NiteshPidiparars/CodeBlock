class CharToASCII
{
    public static int CharToASCII(final char character)
    {
        return(int)character;
    }
    public static char ASCIIToChar(final int ascii)
    {
        return(char)ascii;
    }
    public static void main(String[]args)
    {
        char a='a';
        int i=65;
        System.out.println("Char to ASCII: "+a+" ascii is "+CharToASCII(a));
        System.out.println("ASCII to char: "+i+" char is "+ASCIIToChar(i));
    }
}
