import java.awt.*;
import java.awt.event.*;
public class AWTLayoutDemoWindowAdapter
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTLayoutDemoWindowAdapter()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoWindowAdapter awtWindow=new AWTLayoutDemoWindowAdapter();
        awtWindow.showWindowLayoutDemo();
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
    private void showWindowLayoutDemo()
    {
        l1.setText("Listener Demo : WindowAdapter");
        Button okButton=new Button("OK");
        final Frame aboutFrame=new Frame();
        aboutFrame.setBounds(200,200,300,200);
        aboutFrame.setVisible(true);
        aboutFrame.setTitle("WindowAdapter Demo");
        aboutFrame.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                aboutFrame.dispose();
                            }
                            });
                            Label l3=new Label();
                            l3.setAlignment(Label.CENTER);
                            l3.setText("Welcome to AWTTutorial Point");
                            aboutFrame.add(l3);
                            aboutFrame.setVisible(true);
    }
}
