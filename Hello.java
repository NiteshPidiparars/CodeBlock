public class Hello
{
    public static void main(String[]args)
    {
        String s=new String();
        s=null;
        System.gc();
        System.out.println("Main Completed");
    }
    protected void finalize()
    {
        System.out.println("Finalized called in the function");
  }
}
