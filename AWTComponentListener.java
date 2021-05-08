import java.awt.*;
import java.awt.event.*;
public class AWTComponentListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTComponentListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTComponentListener awtListener=new AWTComponentListener();
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
        l1.setText("Listener Demo : ComponentListener");
        ScrollPane pane=new ScrollPane();
        pane.setBackground(Color.magenta);

        Label l3=new Label();
        l3.setText("Welcome to AWTTutorial Point");
        l3.setSize(300,300);
        l3.addComponentListener(new CustomComponentListener());
        pane.add(l3);
        p.add(pane);
        f.setVisible(true);
    }
    class CustomComponentListener implements ComponentListener
    {
        public void componentResized(ComponentEvent e)
        {
           l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" resize ");
        }
        public void componentMoved(ComponentEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" moved ");
        }
        public void componentShown(ComponentEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" shown ");
        }
        public void componentHidden(ComponentEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" hidden ");
        }
    }
}
