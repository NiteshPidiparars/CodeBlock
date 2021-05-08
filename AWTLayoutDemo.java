import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
public class AWTLayoutDemo
{
    private Frame f;private Label l1;private Label l2;private Label l3;private Panel p;
    public AWTLayoutDemo()
    {
        prepareGUI();
    }
    public static void main(String[]args)
    {
        AWTLayoutDemo awtLayoutDemo=new AWTLayoutDemo();
        awtLayoutDemo.showBoarderLayoutDemo();
    }
    private void prepareGUI()
    {
        f=new Frame("Java AWT Example");
        f.setBounds(200,150,500,500);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,1));
        f.setLayout(new GridLayout(3,1));
        f.addWindowListener(new WindowAdapter()
            {
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
      l1 = new Label();
      l1.setAlignment(Label.CENTER);
      l2 = new Label();
      l2.setAlignment(Label.CENTER);
      l2.setSize(350,150);

      l3 = new Label();
      l3.setAlignment(Label.CENTER);
      l3.setText("Welcome to Tutorial Point AWTTutorials");
      p=new Panel();
      p.setLayout(new FlowLayout());
      f.add(l1);
      f.add(l2);
      f.add(l3);
      f.add(p);
      f.setVisible(true);
}
private void showBoarderLayoutDemo()
{
    l1.setText("Layout in Action : BorderLayout");

    Panel panel=new Panel();
    panel.setBackground(Color.darkGray);
    panel.setSize(300,300);
    BorderLayout layout=new BorderLayout(10,10);
    panel.setLayout(layout);

    panel.add(new Button("Center"),BorderLayout.CENTER);
    panel.add(new Button("Line start"),BorderLayout.LINE_START);
    panel.add(new Button("Line End"),BorderLayout.LINE_END);
    panel.add(new Button("East"),BorderLayout.EAST);
    panel.add(new Button("West"),BorderLayout.WEST);
    panel.add(new Button("North"),BorderLayout.NORTH);
    panel.add(new Button("South"),BorderLayout.SOUTH);
    p.add(panel);
    f.setVisible(true);
 }
}
