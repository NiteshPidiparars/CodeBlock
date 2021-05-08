import java.awt.*;
import java.awt.event.*;
public class AWTFocusListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTFocusListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTFocusListener awtListener=new AWTFocusListener();
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
        l1.setText("ListenerDemo : FocusListener");
        Button btn1=new Button("OK");
        Button btn2=new Button("Cancel");
        btn1.addFocusListener(new CustomFocusListener());
        btn2.addFocusListener(new CustomFocusListener());
        p.add(btn1);
        p.add(btn2);
        f.setVisible(true);
    }
    class CustomFocusListener implements FocusListener
    {
        public void focusGained(FocusEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" focusGained ");
        }
        public void focusLost(FocusEvent e)
        {
            l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" focusLost ");
        }
    }
}




