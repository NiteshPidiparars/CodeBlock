import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SpinnerExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("SpinnerExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel l=new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(100,50,120,30);
        SpinnerModel value=new SpinnerNumberModel(5//initial value
                                                 ,0//minimum value
                                                 ,10//maximum value
                                                 ,1//step
                                                 );
        JSpinner sp=new JSpinner(value);
        sp.setBounds(100,100,50,30);
        sp.addChangeListener(new ChangeListener()
                            {
                                public void stateChanged(ChangeEvent e)
                            {
                                l.setText("Value : "+((JSpinner)e.getSource()).getValue());
                            }
                            });
        f.add(l);
        f.add(sp);
    }
}
