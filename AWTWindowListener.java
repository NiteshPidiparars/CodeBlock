import java.awt.*;
import java.awt.event.*;
public class AWTWindowListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;private Frame aboutFrame;
    public AWTWindowListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTWindowListener awtListener=new AWTWindowListener();
        awtListener.showListener();
    }
    private void PrepareGUI()
    {
        f=new Frame("AWTWindowListener");
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
        Button btn=new Button("OK");
        aboutFrame=new Frame();
        aboutFrame.setBounds(250,200,250,250);
        aboutFrame.setVisible(true);
        aboutFrame.setTitle("Window Listener");
        aboutFrame.addWindowListener(new CustomWindowListener());

        Label l3=new Label();
        l3.setAlignment(Label.CENTER);
        l3.setText("Welcome to AWTTutorial Point");
        l3.setSize(100,100);
        aboutFrame.add(l3);
        f.setVisible(true);
    }
    class CustomWindowListener implements WindowListener
    {
        public void windowOpened(WindowEvent e){
        }
        public void windowClosing(WindowEvent e)
        {
            aboutFrame.dispose();
        }
        public void windowClosed(WindowEvent e){
        }
        public void windowIconified(WindowEvent e){
        }
        public void windowDeiconified(WindowEvent e){
        }
        public void windowActivated(WindowEvent e){
        }
        public void windowDeactivated(WindowEvent e){
        }
    }
}



