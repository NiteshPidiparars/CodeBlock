import java.awt.*;
import java.awt.event.*;
public class AWTLayoutDemoFlow
{
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public AWTLayoutDemoFlow()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoFlow awtLayout=new AWTLayoutDemoFlow();
        awtLayout.showFlowLayoutDemo();
    }
    private void PrepareGUI()
    {
        f=new Frame();
        f.setBounds(200,150,450,400);
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
                            l2.setSize(300,100);
                            l3=new Label();
                            l3.setAlignment(Label.CENTER);
                            l3.setText("Welcome to AWTTutorial Point");

                            p=new Panel();
                            p.setLayout(new FlowLayout());
                            f.add(l1);
                            f.add(l2);
                            f.add(l3);
                            f.add(p);
                            f.setVisible(true);
    }
    private void showFlowLayoutDemo()
    {
        l1.setText("Action Demo : FlowLayout");
        Panel panel=new Panel();
        panel.setBackground(Color.darkGray);
        panel.setSize(300,300);

        FlowLayout layout=new FlowLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);
        panel.add(new Button("OK"));
        panel.add(new Button("Cancel"));
        p.add(panel);
        f.setVisible(true);
    }
}
