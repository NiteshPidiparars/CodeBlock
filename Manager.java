import java.lang.Object;
import javax.swing.UIManager;
public class Manager
{
    public static void main(String[]args)
    {
        try
        {
            UIManager.LookAndFeelInfo[] looks=UIManager.getInstalledLookAndFeels();
            for(UIManager.LookAndFeelInfo look: looks){
                System.out.println(look.getClassName());
            }
        }
        catch(Exception e)
        {
            System.out.println("Look and Feel Exception");
        }
    }
}
