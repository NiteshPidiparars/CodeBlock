import java.awt.*;
import java.awt.TextArea;
import java.awt.event.*;
class TextAreaEP2 extends Frame implements ActionListener
{
    TextArea area;Label l1,l2;Buttton btn;
    TextAreaEP2()
    {
        Frame f=new Frame("My Frame");
        f.setBounds(350,130,600,350);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
            {
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
        TextArea area=new TextArea("Welcome to JavaTPoint");
        area.setBounds(110,105,400,190);
        Label l1=new Label();
        l1.setBounds(60,180,80,30);
        Label l2=new Label();
        l2.setBounds(285,80,80,30);
        Button btn=new Button("Show");
        btn.setBounds(520,180,50,30);
        btn.addActionListener(this);
        f.add(area);
        f.add(l1);
        f.add(l2);
        f.add(btn);
    }
    public void actionPerformed(ActionEvent e)
    {
         String command = area.getText();
         if( command.equals( "OK" ))  {
            l1.setText("Ok Button clicked.");
         }
         else if( command.equals( "Submit" ) )  {
            l2.setText("Submit Button clicked.");
         }
         else  {
            l1.setText("Cancel Button clicked.");
      }
    }
    public static void main(String[]args)
    {
        new TextAreaEP2();
    }
}
