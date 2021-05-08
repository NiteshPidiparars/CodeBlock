import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
public class AWTLayoutDemoCard
{
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public AWTLayoutDemoCard()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoCard awtCard=new AWTLayoutDemoCard();
        awtCard.showCardLayoutDemo();
    }
    private void PrepareGUI()
    {
        f=new Frame();
        f.setBounds(200,150,400,450);
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
    private void showCardLayoutDemo()
    {
        l1.setText("Action Demo : CardLayout");
        Panel panel=new Panel();
        panel.setBackground(Color.CYAN);
        panel.setSize(350,350);

        CardLayout layout=new CardLayout();
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);

        final Panel buttonPanel=new Panel(new FlowLayout());
        buttonPanel.add(new Button("OK"));
        buttonPanel.add(new Button("Cancel"));

        final Panel textPanel=new Panel();
        textPanel.add(new Label("Name :"));
        textPanel.add(new TextField(20));

        panel.add("Button",buttonPanel);
        panel.add("Text",textPanel);

        Choice c=new Choice();
        c.add("Button");
        c.add("Text");
        c.addItemListener(new ItemListener()
                          {
                              public void itemStateChanged(ItemEvent e)
                          {
                              CardLayout cardLayout=(CardLayout)(panel.getLayout());
                              cardLayout.show(panel,(String)e.getItem());
                          }
                          });
                          p.add(c);
                          p.add(panel);
                          f.setVisible(true);
    }
}
