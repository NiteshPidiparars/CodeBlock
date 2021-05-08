import java.awt.*;
import javax.swing.*;
public class TextAreaExample2
{
    JFrame f;
    JTextArea a;
    TextAreaExample2()
    {
        f=new JFrame("TextAreaExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a=new JTextArea(300,300);
        a.setBounds(30,30,300,300);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
        a.setText("This is a TextArea");
        f.add(a);
    }
        public static void main(String[]args)
        {
            new TextAreaExample2();
        }
}
