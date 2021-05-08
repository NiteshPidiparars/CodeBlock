class Example1
{
    public static void main(String[]args)
    {
        int temperature=0;
        if(args.length>0){
            try{
            temperature=Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Must entered first arguments: ");
            }
        }
        else{
            System.out.println("must entered first arguments: ");
        }
    }
}
