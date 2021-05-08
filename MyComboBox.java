import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MyComboBox
{
    static Container cntr;
    static JComboBox cb1;
    static JButton btn;
    static JLabel msg;
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("My ComboBox");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,600,500);

        cntr=frame.getContentPane();
        cntr.setLayout(null);

        String[] arr={"A","B","C","D"};
        cb1=new JComboBox(arr);//select the Choice
        cb1.setBounds(100,50,100,30);
        cb1.setEditable(true);

        cb1.addItem("E");//add item in dynamically in comboBox
        cb1.addItem("F");

        cb1.removeItem("D");//remove item in dynamically in comboBox
        cb1.removeItem("A");

        btn=new JButton("OK");
        btn.setBounds(250,50,100,30);

        btn.addActionListener(new ActionListener(){
                              public void actionPerformed(ActionEvent event)
                              {
                                  btnEvent(event);
                              }
                              });

        msg=new JLabel("Msg");
        msg.setBounds(100,150,150,40);

        //cb1.setSelectedIndex(2);

        //cb1.setSelectedItem("D");

        //Font f=new Font("Arial",Font.BOLD,20);
        //cb1.setFont(f);
        cntr.add(cb1);
        cntr.add(btn);
        cntr.add(msg);
        cntr.revalidate();
    }
    static void btnEvent(ActionEvent event)
    {
        String item=(String)cb1.getSelectedItem();
        msg.setText(item);
        //msg.setText(Integer.toString(cb1.getSelectedIndex()));
    }
}
