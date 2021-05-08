import java.awt.*;
import java.awt.event.*;
class ActionListenerFrame extends Frame implements ActionListener
{
    Label lb1,lb2,lb3;Button btn,btn1,btn2;
    ActionListenerFrame()
    {
     Frame f=new Frame("My Frame");
     f.setBounds(300,150,550,400);
     f.setLayout(null);
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter()
        {
        public void windowClosing(WindowEvent e){
        System.exit(0);
        }
    });


    lb1=new Label("Control in Action : Button");
    lb1.setBounds(200,190,120,50);
    lb2=new Label();
    lb2.setAlignment(Label.CENTER);
    lb2.setBounds(200,300,120,50);

    btn=new Button("OK");
    btn1=new Button("Submit");
    btn2=new Button("Cancel");

    btn.setBounds(150,190,80,30);
    btn1.setBounds(230,190,80,30);
    btn2.setBounds(310,190,80,30);

    btn.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    f.add(lb1);
    f.add(lb2);
    f.add(btn);
    f.add(btn1);
    f.add(btn2);
   }
    public void actionPerformed(ActionEvent e)
   {
       String command=e.getActioCummand();
       if(command.equals("OK")){
        lb2.setText("OK Button Clicked");
       }
       else if(command.equals("Submit")){
        lb2.setText("Submit Button Clicked");
       }
       else{
        lb2.setText("Cancel Button Clicked");
         }
   }
   public static void main(String[]args)
   {
       new ActionListenerFrame();
   }
}
