import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
public class AWTLayoutDemoKeyAdapter
{
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public AWTLayoutDemoKeyAdapter()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoKeyAdapter awtKey=new AWTLayoutDemoKeyAdapter();
        awtKey.showKeyLayoutDemo();
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
    private void showKeyLayoutDemo()
    {
        l1.setText("Action Demo : KeyAdapter");
        final TextField text=new TextField(20);
        text.addKeyListener(new KeyAdapter()
                            {
                                public void KeyTyped(KeyEvent e)
                            {
                                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                                {
                                    l2.setText("Entered Key : "+text.getText());
                                }
                            }
                            });
                            Button okButton=new Button("OK");
                            okButton.addActionListener(new ActionListener()
                                                       {
                                                           public void actionPerformed(ActionEvent e)
                                                       {
                                                           l2.setText("Entered Key: "+text.getText());
                                                       }
                                                       });
                                                       p.add(text);
                                                       p.add(okButton);
                                                       f.setVisible(true);
    }
}

