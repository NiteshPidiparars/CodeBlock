import java.awt.*;
import java.awt.event.*;
public class BorderLayoutExample extends Frame {

    public static void main(String[] args) {
        BorderLayoutExample a = new BorderLayoutExample();
    }

    public BorderLayoutExample() {
        Frame f=new Frame("Border Layout");
        f.setBounds(250,200,400,350);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e){
                                System.exit(0);
                                }
                            });
                            Panel p=new Panel();
                            p.setBounds(150,150,200,150);
        BorderLayout b = new BorderLayout();
        p.add(new Button("North"), BorderLayout.NORTH);
        p.add(new Button("South"), BorderLayout.SOUTH);
        p.add(new Button("East"), BorderLayout.EAST);
        p.add(new Button("West"), BorderLayout.WEST);
        p.add(new Button("Center"), BorderLayout.CENTER);
    }
}
