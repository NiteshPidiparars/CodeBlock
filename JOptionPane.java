import java.awt.*;
import javax.swing.*;
public class JOptionDemo
{
    public static void main(String[]args)
    {
        String fullname="";
        String strAge="";
        int age=0;
        fullname=JOptionPane.showInputDialog(null,"Enter your Full name: ");
        JOptionPane.showMessageDialog(null,"Your Full Name is: "+fullname);
    }
}
