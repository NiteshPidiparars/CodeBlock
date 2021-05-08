import java.awt.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.*;
public class AboutDialog extends JDialog
{
public AboutDialog()
{
    initUI();
}
public final void initUI()
{
    setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
    add(Box.createRigidArea(new Dimension(0,10)));
    //place th area in the class path
    ImageIcon icon=new ImageIcon("Image.JPG");
    JLabel l=new JLabel(icon);
    l.setAlignmentX(0.5f);
    add(l);
    add(Box.createRigidArea(new Dimension(0,10)));
    JLabel name=new JLabel("Java Programing,2.2.6");
    name.setFont(new Font("Serif",Font.BOLD,13));
    name.setAlignmentX(0.5f);
    add(name);
    add(Box.createRigidArea(new Dimension(0,10)));
    JButton btn=new JButton("Close");
    btn.addActionListener(new ActionListener()
                          {
                              public void actionPerformed(ActionEvent e)
                          {
                              dispose();
                          }
                          });
    btn.setAlignmentX(0.5f);
    add(btn);
    setModalityType(ModalityType.APPLICATION_MODAL);
    setTitle("About Java Application");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setBounds(250,150,300,300);
    setVisible(true);
}
public static void main(String[]args)
{
    new AboutDialog();
}
}
