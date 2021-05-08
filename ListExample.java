import java.awt.*;
import java.awt.event.*;
public class ListExample
{
    public static void main(String[]args)
    {
        Frame f=new Frame(" ListExample ");
        f.setBounds(300,200,450,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            List l1=new List(5);
                            l1.setBounds(100,100,75,75);
                            l1.add("Item 1");
                            l1.add("Item 2");
                            l1.add("Item 3");
                            l1.add("Item 4");
                            l1.add("Item 5");
                            f.add(l1);
    }
}
