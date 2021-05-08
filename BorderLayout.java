import java.awt.*;
import javax.swing.*;
public class BorderLayout
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.setBounds(300,200,450,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("BorderLayout");

        Container cntr=f.getContentPane();
        BorderLayout bl=new BorderLayout();
        cntr.setLayout(b1);

        JButton btn1=new JButton("PAGE_START");
        JButton btn2=new JButton("PAGE_END");
        JButton btn3=new JButton("LINE_START");
        JButton btn4=new JButton("CENTER");
        JButton btn5=new JButton("LINE_END");

        cntr.add(btn1,BorderLayout.PAGE_START);
        cntr.add(btn2,BorderLayout.PAGE_END);
        cntr.add(btn3,BorderLayout.LINE_START);
        cntr.add(btn4,BorderLayout.CENTER);
        cntr.add(btn5,BorderLayout.LINE_END);
    }
}

