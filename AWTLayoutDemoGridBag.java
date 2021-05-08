import java.awt.*;
import java.awt.event.*;
public class AWTLayoutDemoGridBag
{
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public AWTLayoutDemoGridBag()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoGridBag awtGrid=new AWTLayoutDemoGridBag();
        awtGrid.showGridBagLayoutDemo();
    }
    private void PrepareGUI()
    {
        f=new Frame();
        f.setBounds(200,150,600,400);
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

                            l3=new Label();
                            l3.setAlignment(Label.CENTER);
                            l3.setText("Welcome To AWTTutorial Point");
                            p=new Panel();
                            p.setLayout(new FlowLayout());
                            f.add(l1);
                            f.add(l2);
                            f.add(l3);
                            f.add(p);
                            f.setVisible(true);
    }
    private void showGridBagLayoutDemo()
    {
        l1.setText("Action Demo : GridBagLayout");
        Panel panel=new Panel();
        panel.setBackground(Color.darkGray);
        panel.setSize(400,400);

        GridBagLayout layout=new GridBagLayout();
        panel.setLayout(layout);

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(new Button("Button1"));

        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(new Button("Button2"));

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=20;
        gbc.gridx=1;
        gbc.gridy=0;
        panel.add(new Button("Button3"));

        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(new Button("Button4"));
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=2;
        panel.add(new Button("Button5"));
        p.add(panel);
        f.setVisible(true);
    }
}
