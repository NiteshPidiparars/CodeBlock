import java.awt.*;
import java.awt.event.*;
public class AWTMouseMotionListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;private Frame aboutFrame;
    public AWTMouseMotionListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTMouseMotionListener awtListener=new AWTMouseMotionListener();
        awtListener.showListener();
    }
    private void PrepareGUI()
    {
        f=new Frame("AWTMouseMotionListener");
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
    private void showListener()
    {
        l1.setText("Listener Demo : MouseMotionListener");
        Panel pn=new Panel();
        pn.setBackground(Color.magenta);
        pn.setLayout(new FlowLayout());
        pn.addMouseMotionListener(new CustomMouseMotionListener());

        Label l3=new Label();
        l3.setAlignment(Label.CENTER);
        l3.setText("Welcome to AWTTutorial Point");
        pn.add(l3);
        p.add(pn);
        f.setVisible(true);
    }
    class CustomMouseMotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {
            l2.setText("Mouse Dragged : "+"("+e.getX()+" "+e.getY()+")");
        }
        public void mouseMoved(MouseEvent e)
        {
            l2.setText("Mouse Moved : "+"("+e.getX()+" "+e.getY()+")");
        }
    }
}




