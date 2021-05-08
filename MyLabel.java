import java.awt.*;
import javax.swing.*;
public class MyLabel
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("My Label");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);
        //JLabel l=new JLabel("UserName");
        //l.setText("Password");
        //l.setText("Password");
        //l.setBounds(100,100,120,30);
        //Font ft=new Font("Arial",Font.BOLD,25);
        //l.setFont(ft);
        ImageIcon icon=new ImageIcon("Image2.JPG");
        JLabel l=new JLabel("Text",icon,JLabel.RIGHT);
        l.setBounds(100,100,200,40);
        c.add(l);
    }
}
