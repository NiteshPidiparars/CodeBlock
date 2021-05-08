import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
public class AWTTextListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;private TextField text;
    public AWTTextListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTTextListener awtListener=new AWTTextListener();
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
        l1.setText("ListenerDemo : KeyListener");
        text=new TextField(10);
        text.addTextListener(new CustomTextListener());

        Button btn=new Button("OK");
        btn.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  l2.setText("Entered Text : "+text.getText());
                              }
                              });
                              p.add(text);
                              p.add(btn);
                              f.setVisible(true);
    }
    class CustomTextListener implements TextListener
    {
        public void textValueChanged(TextEvent e)
        {
            l2.setText("Entered Text : "+text.getText());
        }
    }
}



