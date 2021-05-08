import java.awt.*;
import javax.swing.*;
public class MyFlowLayout
{
    static JButton btn1=new JButton("JButton1");
    static JButton btn2=new JButton("JButton2");
    static JButton btn3=new JButton("JButton3");
    static JButton btn4=new JButton("JButton4");
    static JButton btn5=new JButton("JButton5");
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,200,500,300);
        f.setTitle("FlowLayout");

        Container c=f.getContentPane();
        FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
        c.setLayout(f1);

        c.add(btn1);//4 1 3 2 5
        c.add(btn2);
        c.add(btn3,1);
        c.add(btn4,0);
        c.add(btn5);
    }
}
