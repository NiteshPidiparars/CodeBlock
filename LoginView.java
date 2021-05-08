import java.awt.*;
import javax.swing.*;
public class LoginView
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("LoginView");
        f.setBounds(250,150,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        f.add(p);
        placeComponent(p);
    }
    private static void placeComponent(JPanel p)
    {
        p.setLayout(null);
        JLabel l=new JLabel("User");
        l.setBounds(50,50,70,30);
        p.add(l);
        JTextField tf=new JTextField(20);
        tf.setBounds(130,50,120,30);
        p.add(tf);
        JLabel l1=new JLabel("Password");
        l1.setBounds(50,100,70,30);
        p.add(l1);
        JPasswordField pf=new JPasswordField(20);
        pf.setBounds(130,100,120,30);
        p.add(pf);
        JButton btn=new JButton("Login");
        btn.setBounds(50,150,70,30);
        p.add(btn);
        JButton btn1=new JButton("Register");
        btn1.setBounds(177,150,70,30);
        p.add(btn1);
    }
}
