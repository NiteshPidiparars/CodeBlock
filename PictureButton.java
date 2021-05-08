 import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    public class PictureButton {
      public static void main(String[] args)
      {
        JFrame frame = new JFrame();
        Icon icon = new ImageIcon("rhino.gif");
        JButton button = new JButton(icon);
        button.setBounds(100,150,80,50);

        button.addActionListener( new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
            System.out.println("Urp!");
          }
        });
        frame.setBounds(250,150,400,300);
        frame.getContentPane().add( button );
        frame.pack();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
      }
    }
