import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.*;
/*<applet code="ScrollPaneExample" width="250" height="250"> </applet>*/
public class ScrollPaneExample extends JApplet
{
    Container c;
    JPanel p;
    public void init()
    {
        c=getContentPane();
        c.setLayout(new BorderLayout());
        p=new JPanel();
        p.setLayout(new GridLayout(20,20));
        int b=1;
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                p.add(new JButton("Button"+b));
                b++;
            }
        }
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp=new JScrollPane(p,v,h);
        c.add(jsp,"Center");
    }
}
