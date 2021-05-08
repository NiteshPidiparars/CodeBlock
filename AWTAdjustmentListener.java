import java.awt.*;
import java.awt.event.*;
public class AWTAdjustmentListener
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTAdjustmentListener()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTAdjustmentListener awtListener=new AWTAdjustmentListener();
        awtListener.showAWTAdjustmentListener();
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
                            l2.setSize(350,150);

                            p=new Panel();
                            p.setLayout(new FlowLayout());
                            f.add(l1);
                            f.add(l2);
                            f.add(p);
                            f.setVisible(true);
    }
    private void showAWTAdjustmentListener()
    {
        l1.setText("Listener Demo : AdjustmentListener");
        ScrollPane pane=new ScrollPane();
        pane.setBackground(Color.magenta);
        pane.getHAdjustable().addAdjustmentListener(new CustomAdjustmentListener());

        Label l3=new Label();
        l3.setAlignment(Label.CENTER);
        l3.setText("Welcome to AWTTutorial Point");
        pane.add(l3);
        p.add(pane);
        f.setVisible(true);
    }
    class CustomAdjustmentListener implements AdjustmentListener
    {
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
            l2.setText(" Adjustment Listener : "+Integer.toString(e.getValue()));
        }
    }
}
