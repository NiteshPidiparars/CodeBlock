public class MyOwnException
{
    public static void main(String[]args)
    {
        try
        {
            MyOwnException.myTest(null);
        }catch(MyAppException mae)
        {
            System.out.println("Inside Exception: "+mae.getMessage());
        }
    }
    static void myTest(String str)throws MyAppException
    {
        if(str==null){
            throw new MyAppException("String value is null");
        }
    }
}
class MyAppException extends Exception
{
  private String message=null;
  public MyAppException()
  {
      super();
  }
  public MyAppException(String message)
  {
      super(message);
      this.message=message;
  }
  public MyAppException(Throwable cause)
  {
      super(cause);
  }
  public String toString()
  {
      return message;
  }
  public String getMessage()
  {
      return message;
  }
}
