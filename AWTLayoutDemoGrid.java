import java.awt.*;
import java.awt.event.*;
public class AWTLayoutDemoGrid
{
    public AWTLayoutDemoGrid()
    {
        PrepareGUI();
    }
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public static void main(String[]args)
    {
        AWTLayoutDemoGrid awtLayout=new AWTLayoutDemoGrid();
        awtLayout.showGridLayoutDemo();
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
    private void showGridLayoutDemo()
    {
        l1.setText("Action Demo : GridLayout");
        Panel panel=new Panel();
        panel.setBackground(Color.darkGray);
        panel.setSize(300,300);

        GridLayout layout=new GridLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);
        panel.add(new Button("Button 1"));
        panel.add(new Button("Button 2"));
        panel.add(new Button("Button 3"));
        panel.add(new Button("Button 4"));
        panel.add(new Button("Button 5"));
        p.add(panel);
        f.setVisible(true);
    }
}
