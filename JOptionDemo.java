import java.awt.*;
import javax.swing.JOptionPane;
public class JOptionDemo
{
    public static void main(String[]args)
    {
        String fullname="";
        String strAge="";
        int age=0;
        fullname=JOptionPane.showInputDialog(null,"Enter your name: ");
        JOptionPane.showMessageDialog(null,"Your name is :"+fullname);
        strAge=JOptionPane.showInputDialog(null,"Enter your age: ");
        age=Integer.parseInt(strAge);
        JOptionPane.showConfirmDialog(null,age,"Is this your age?",JOptionPane.OK_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null,"Your age is: "+age);
    }
}
