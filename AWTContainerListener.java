import java.awt.*;
import java.awt.event.*;
public class AWTContainerListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTContainerListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTContainerListener awtListener=new AWTContainerListener();
        awtListener.showAWTContainerListener();
    }
    private void PrepareGUI()
    {
        f=new Frame();
        f.setBounds(200,150,400,400);
        f.setLayout(new GridLayout(3,1));
        f.setVisible(true);
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
    private void showAWTContainerListener()
    {
        l1.setText("ListenerDemo : ContainerListener");
        ScrollPane pane=new ScrollPane();
        pane.setBackground(Color.magenta);
        pane.addContainerListener(new CustomContainerListener());

        Label l3=new Label();
        l3.setAlignment(Label.CENTER);
        l3.setText("Welcome to AWTTutorial Point");
        pane.add(l3);
        p.add(pane);
        f.setVisible(true);
    }
    class CustomContainerListener implements ContainerListener
    {
        public void componentAdded(ContainerEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" added " );
        }
        public void componentRemoved(ContainerEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" removed ");
        }
    }
}
