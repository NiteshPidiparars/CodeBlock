import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LayeredPaneExample extends JFrame
 {
     public LayeredPaneExample()
    {
    JFrame f=new JFrame("LayeredPaneExample");
    f.setBounds(250,150,300,300);
    f.setVisible(true);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLayeredPane pane=getLayeredPane();
    JButton top=new JButton();
    top.setBackground(Color.white);
    top.setBounds(20,20,50,50);
    JButton middle=new JButton();
    middle.setBackground(Color.red);
    middle.setBounds(40,40,50,50);
    JButton bottom=new JButton();
    bottom.setBackground(Color.cyan);
    bottom.setBounds(60,60,50,50);
    pane.add(bottom,new Integer(1));
    pane.add(middle,new Integer(2));
    pane.add(top,new Integer(3));
  }
  public static void main(String[]args)
  {
      LayeredPaneExample lp=new LayeredPaneExample();
      lp.setVisible(true);
  }
}
