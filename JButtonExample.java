import javax.swing.*;
import java.awt.*;
class JButtonExample extends JFrame
{
    public static void main(String[]args)
    {
        JPanel panel=new JPanel();
        JButton button=new JButton("Click Me");
        super("JButton Example");
        setBounds(400,150,300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=this.getContentPane();
        c.add(panel);
        button.setMnemonic('P');
        panel.add(button);
        button.requestFocus();
        setVisible(true);
    }
}
