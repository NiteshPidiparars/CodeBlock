import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ToggleButtonExample implements ItemListener
{
    public static void main(String[]args)
    {
       new ToggleButtonExample();
    }
    private JToggleButton btn;JFrame f;
    ToggleButtonExample()
    {
        f=new JFrame("ToggleButtonExample with itemListener");
        f.setBounds(200,150,400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJToggleButton();
        setAction();
    }
    private void setJToggleButton()
    {
        btn=new JToggleButton("ON");
        f.add(btn);
    }
    private void setAction()
    {
        btn.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(btn.isSelected())
            btn.setText("OFF");
            else
            btn.setText("ON");
    }
}
