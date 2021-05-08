import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.border.EtchedBorder;
import javax.swing.*;
public class MultipleEventSource extends JFrame
{
    JLabel l;
    public MultipleEventSource()
    {
        initUI();
    }
    public final void initUI()
    {
        JFrame f=new JFrame("LoginView");
        f.setBounds(250,150,300,300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        p.setLayout(null);
        l=new JLabel("Click on any button");
        l.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));

        JButton btn1=new JButton("Button 1");
        btn1.setBounds(50,50,100,30);
        btn1.addActionListener(new ButtonListener());

        JButton btn2=new JButton("Button 2");
        btn2.setBounds(50,90,100,30);
        btn2.addActionListener(new ButtonListener());

        JButton btn3=new JButton("Button 3");
        btn3.setBounds(50,130,100,30);
        btn3.addActionListener(new ButtonListener());
        JButton btn4=new JButton("Button 4");
        btn4.setBounds(50,170,100,30);
        btn4.addActionListener(new ButtonListener());

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        f.add(l,BorderLayout.SOUTH);
        f.add(p);
    }
    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton o=(JButton)e.getSource();
            String label=o.getText();
            l.setText(""+label+" button clicked");
        }
    }
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(new Runnable()
                                   {
                                       public void run()
                                   {
                                       MultipleEventSource me=new MultipleEventSource();
                                       me.setVisible(true);
                                   }
                                   });
    }
}
