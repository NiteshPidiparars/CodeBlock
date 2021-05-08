import java.awt.*;
import javax.swing.*;
public class JDPaneDemo
{
    public JDPaneDemo()
    {
        JFrame f=new JFrame("JDPaneDemo");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CustomDesktopPane dep=new CustomDesktopPane();
        Container ctr=f.getContentPane();
        ctr.add(dep,BorderLayout.CENTER);
        dep.display(dep);
        f.add(dep);
    }
    public static void main(String[]args)
    {
        new JDPaneDemo();
    }
}
class CustomDesktopPane extends JDesktopPane
{
    int numFrame=3,x=20,y=30;
    public void display(CustomDesktopPane pn)
    {
        for(int i=0;i<numFrame;i++)
        {
            JInternalFrame jframe=new JInternalFrame("Internal Frame: "+i,true,true,true,true);
            jframe.setBounds(x,y,250,85);
            Container ct=jframe.getContentPane();
            ct.add(new Label("I Love my Country"));
            pn.add(jframe);
            jframe.setVisible(true);
            y+=85;
        }
    }
};
