import javax.swing.*;
import java.awt.*;
public class MyPasswordField
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("MyPasswordField");
        f.setBounds(200,150,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l=new JLabel("Password");
        l.setBounds(90,70,150,50);
        JPasswordField pf=new JPasswordField();
        pf.setBounds(220,80,150,30);
        Container ctr=f.getContentPane();
        ctr.setLayout(null);
        Font ft=new Font("Arial",Font.BOLD,25);
        l.setFont(ft);
        Font ft1=new Font("Arial",Font.BOLD,25);
        pf.setFont(ft1);
        ctr.add(l);
        ctr.add(pf);
    }
}
