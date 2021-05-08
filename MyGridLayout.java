import java.awt.*;
import javax.swing.*;
public class MyGridLayout
{
    static JButton btn1=new JButton("Button1");
    static JButton btn2=new JButton("Button2");
    static JButton btn3=new JButton("Button3");
    static JButton btn4=new JButton("Button4");
    static JButton btn5=new JButton("Button5");
    static JButton btn6=new JButton("Button6");
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.setBounds(200,150,450,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("MyGridLayout");

        Container cntr=f.getContentPane();
        GridLayout layout=new GridLayout(2,6,10,20);
        //layout.setHgap(10);
        //layout.setVgap(20);
        cntr.setLayout(layout);

        cntr.add(btn1);//4 1 3 2 5 6
        cntr.add(btn2);
        cntr.add(btn3,1);
        cntr.add(btn4,0);
        cntr.add(btn5);
        cntr.add(btn6);
    }
}
