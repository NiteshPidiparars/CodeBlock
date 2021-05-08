import java.awt.*;
import java.awt.event.*;
public class ChoiceExample
{
    public static void main(String[]args)
    {
        Frame f=new Frame("ChoiceExample Frame");
        f.setBounds(250,180,450,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()

                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            Choice c=new Choice();
                            c.setBounds(100,100,85,75);
                            c.add("Item 1");
                            c.add("Item 2");
                            c.add("Item 3");
                            c.add("Item 4");
                            c.add("Item 5");
                            f.add(c);
    }
}
