import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
public class AWTKeyListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;private TextField text;
    public AWTKeyListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTKeyListener awtListener=new AWTKeyListener();
        awtListener.showListener();
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
    private void showListener()
    {
        l1.setText("ListenerDemo : KeyListener");
        Panel panel=new Panel();
        panel.setBackground(Color.magenta);
        panel.setSize(300,300);
        panel.addMouseListener(new CustomMouseListener());

        Label l3=new Label();
        l3.setAlignment(Label.CENTER);
        l3.setText("Welcome to AWTTutorial Point");
        l3.addMouseListener(new CustomMouseListener());
        panel.add(l3);
        p.add(panel);
        f.setVisible(true);
    }
    class CustomMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            l2.setText("Mouse Clicked : "+"("+e.getX()+" "+e.getY()+")");
        }
        public void mousePressed(MouseEvent e){
        }
        public void mouseReleased(MouseEvent e){
        }
        public void mouseEntered(MouseEvent e){
        }
        public void mouseExited(MouseEvent e){
        }
    }
}


