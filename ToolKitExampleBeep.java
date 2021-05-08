import java.awt.*;
import java.awt.event.*;
public class ToolKitExampleBeep
{
    public static void main(String[]args)
    {
        Frame f=new Frame("Toolkit Example");
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
        Button b=new Button("beep");
        b.setBounds(100,50,80,30);
        b.addActionListener(new ActionListener()
                            {
                                public void actionPerformed(ActionEvent e)
                            {
                                Toolkit.getDefaultToolkit().beep();
                            }
                            });
        f.add(b);
    }
}
