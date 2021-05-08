import javax.swing.*;
import java.awt.*;
public class MyTextField
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("MyTextField");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);
        JTextField tf=new JTextField();
        tf.setBounds(100,100,120,30);
        Font ft=new Font("Arial",Font.BOLD,25);
        tf.setFont(ft);
        //tf.setBackground(Color.YELLOW);
        //tf.setForeground(Color.RED);
        Color clr=new Color(120,100,50);
        tf.setBackground(clr);
        c.add(tf);
    }
}
