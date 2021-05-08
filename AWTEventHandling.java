import java.awt.*;
import java.awt.event.*;
public class AWTEventHandling
{
    private Frame f;private Label l1;private Label l2;private Panel p;
    public AWTEventHandling()
    {
        PrepareGUI();
    }
    public static void main(String[]args)
    {
        AWTEventHandling awtHandle=new AWTEventHandling();
        awtHandle.showAWTEventHandling();
    }
    private void PrepareGUI()
    {
        f=new Frame();
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,1));
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            l1=new Label();
                            l1.setAlignment(Label.CENTER);
                            l2=new Label();
                            l2.setAlignment(Label.CENTER);
                            l2.setSize(350,150);

                            p=new Panel();
                            p.setLayout(new FlowLayout());
                            f.add(l1);
                            f.add(l2);
                            f.add(p);
                            f.setVisible(true);
    }
    private void showAWTEventHandling()
    {
        l1.setText("Welcome to AWTTutorial Point");
        Button okButton=new Button("OK");
        Button submitButton=new Button("Submit");
        Button cancelButton=new Button("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickLisetener());
        p.add(okButton);
        p.add(submitButton);
        p.add(cancelButton);
        f.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String command=e.getActionCommand();
            if(command.equals("OK")){
                l2.setText("OK Button Clicked");
            }else if(command.equals("Submit")){
                l2.setText("Submit Button Clicked");
            }else{
                l2.setText("Cancel Button Clicked");
            }
        }
    }
}
