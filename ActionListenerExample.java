import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
public class ActionListenerExample
{
    public static void main(String[]args)
    {
        Frame f=new Frame("ActionListener");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            final TextField tf=new TextField();
                            tf.setBounds(100,100,150,30);
                            Button btn=new Button("Click Me");
                            btn.setBounds(100,150,100,30);
                            btn.addActionListener(new ActionListener()
                                                  {
                                                      public void actionPerformed(ActionEvent e)
                                                  {
                                                      tf.setText("To Performed Action");
                                                  }
                                                  });
                            f.add(tf);
                            f.add(btn);
    }
}
