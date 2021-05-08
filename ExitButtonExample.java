import java.awt.event.*;
import javax.swing.*;
class ExitButtonExample extends JFrame
{
    public ExitButtonExample()
    {
        initUI();
    }
    private void initUI()
    {
        JPanel p=new JPanel();
        getContentPane().add(p);
        p.setLayout(null);
        JButton b=new JButton("Exit ON");
        b.setBounds(90,60,80,30);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });
        p.add(b);
        setTitle("Exit Button Example");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(new Runnable()
                                   {
                                       public void run()
                                   {
                                       ExitButtonExample ex=new ExitButtonExample();
                                       ex.setVisible(true);
                                   }
                                   });
    }
}
