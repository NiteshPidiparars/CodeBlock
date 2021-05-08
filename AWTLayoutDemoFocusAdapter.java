import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
public class AWTLayoutDemoFocusAdapter
{
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public AWTLayoutDemoFocusAdapter()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemoFocusAdapter awtFocus=new AWTLayoutDemoFocusAdapter();
        awtFocus.showFocusLayoutDemo();
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
                            l3=new Label();
                            l3.setAlignment(Label.CENTER);
                            l3.setText("Welcome to AWTTutorial Point");

                            p=new Panel();
                            p.setLayout(new FlowLayout());
                            f.add(l1);
                            f.add(l2);
                            f.add(l3);
                            f.add(p);
    }
    private void showFocusLayoutDemo()
    {
        l1.setText("Action Demo : FocusAdapter");

        Button okButton=new Button("OK");
        Button cancelButton=new Button("Cancel");
        okButton.addFocusListener(new FocusAdapter()
                                   {
                                       public void FocusGained(FocusEvent e)
                                   {
                                      l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" gained focus");
                                   }
                                   });
                                   cancelButton.addFocusListener(new FocusAdapter()
                                                                 {
                                                                     public void FocusLost(FocusEvent e)
                                                                 {
                                                                     l2.setText(l2.getText()+e.getComponent().getClass().getSimpleName()+" lost focus");
                                                                 }
                                                                 });
                                                                 p.add(okButton);
                                                                 p.add(cancelButton);
                                                                 f.setVisible(true);
    }
}
