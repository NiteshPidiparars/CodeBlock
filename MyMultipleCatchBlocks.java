import java.net.*;
public class MyMultipleCatchBlocks
{
    public static void main(String[]args)
    {
        MyMultipleCatchBlocks mmcb=new MyMultipleCatchBlocks();
        mmcb.execute(1);
        mmcb.execute(2);
    }
    public void execute(int i)
    {
        try
        {
            if(i==1)
            {
                getIntValue("7u");
                }
                else
                {
                    getUrlObj(" www.Google.com");
                }
            }catch(NumberFormatException nfe){
             System.out.println("Inside NumberFormatException....."+nfe.getMessage());
            }catch(MalformedURLException mfe){
             System.out.println("Inside MalformedURLException...."+mfe.getMessage());
            }catch(Exception ex){
             System.out.println("Inside Exception...."+ex.getMessage());
            }
    }
  public int getIntValue(String num)
  {
      return Integer.parseInt(num);
  }
  public URL getUrlObj(String urlStr)throws MalformedURLException
  {
      return new URL(urlStr);
  }
}
