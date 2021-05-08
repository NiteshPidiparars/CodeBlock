import java.awt.*;
import javax.swing.*;
public class MyButtonField
{
    public static void main(String[]args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);

        Container c=frame.getContentPane();
        c.setLayout(null);

        JButton btn=new JButton("Click");
        btn.setSize(100,40);
        btn.setLocation(100,50);
        Font f=new Font("Arial",Font.BOLD,25);
        btn.setFont(f);
        btn.setBackground(Color.YELLOW);
        btn.setForeground(Color.RED);//set font color

        Cursor cur=new Cursor(Cursor.TEXT_CURSOR);
        btn.setCursor(cur);

        c.add(btn);

    }
}

