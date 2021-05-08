import java.awt.*;
import java.awt.event.*;
public class PanelExample
{
    public static void main(String[]args)
    {
        Frame f=new Frame("PanelExample");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            Panel p=new Panel();
                            p.setBackground(Color.gray);
                            p.setBounds(70,70,250,250);
                            Button b1=new Button("Button1");
                            b1.setBounds(5,10,80,30);
                            b1.setBackground(Color.yellow);
                            Button b2=new Button("Button2");
                            b2.setBounds(20,10,80,30);
                            b2.setBackground(Color.green);
                            p.add(b1);
                            p.add(b2);
                            f.add(p);
    }
}
