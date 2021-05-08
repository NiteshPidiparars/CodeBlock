import java.awt.*;
import java.awt.event.*;
public class AWTLayoutDemoMouseAdapter
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTLayoutDemoMouseAdapter()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoMouseAdapter awtMouse=new AWTLayoutDemoMouseAdapter();
        awtMouse.showMouseLayoutDemo();
    }
    private void PrepareGUI()
    {
        f=new Frame();
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,1));
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            l1=new Label();
                            l1.setAlignment(Label.CENTER);
                            l2=new Label();
                            l2.setAlignment(Label.CENTER);
                            l2.setSize(350,100);

                            p=new Panel();
                            p.setLayout(new FlowLayout());
                            f.add(l1);
                            f.add(l2);
                            f.add(p);
                            f.setVisible(true);
    }
    private void showMouseLayoutDemo()
    {
        l1.setText("Listener Demo : MouseAdapter");
        Panel panel=new Panel();
        panel.setBackground(Color.magenta);
        panel.setSize(300,300);
        panel.addMouseListener(new MouseAdapter()
                               {
                                   public void mouseClicked(MouseEvent e)
                               {
                                   l2.setText("Mouse Clicked : "+"("+e.getX()+","+e.getY()+")");
                               }
                               });
                               Label l3=new Label();
                               l3.setAlignment(Label.CENTER);
                               l3.setText("Welcome to AWTTutorial Point");
                               l3.addMouseListener(new MouseAdapter()
                                                    {
                                                        public void mouseClicked(MouseEvent e)
                                                    {
                                                        l2.setText("Mouse Clicked : "+"("+e.getX()+","+e.getY()+")");
                                                    }
                                                    });
                                                    panel.add(l3);
                                                    p.add(panel);
                                                    f.setVisible(true);
    }
}
