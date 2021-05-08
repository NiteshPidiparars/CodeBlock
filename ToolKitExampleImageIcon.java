import java.awt.*;
import java.awt.event.*;
public class ToolKitExampleImageIcon
{
    public static void main(String[]args)
    {
        Frame f=new Frame(" ");
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
                            Image icon=Toolkit.getDefaultToolkit().getImage("F:/image.JPG");
                            f.setIconImage(icon);

    }
}
