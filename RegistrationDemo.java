import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RegistrationDemo
{
    static JLabel l1,l2,l3,l4,l5;
    static JTextField tf1,tf2;
    static JComboBox day,month,year;
    static JRadioButton male,female;
    static JTextArea ta,output;
    static JCheckBox cb;
    static  JButton btn;
    public static void main(String[]args)
    {
        JFrame f=new JFrame("RegistrationDemo");
        f.setBounds(200,100,740,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cntr=f.getContentPane();
        cntr.setLayout(null);
        cntr.setBackground(Color.YELLOW);

        l1=new JLabel("Name");
        l1.setBounds(50,50,60,30);
        tf1=new JTextField();
        tf1.setBounds(150,50,150,30);
        l2=new JLabel("Mobile");
        l2.setBounds(50,100,60,30);
        tf2=new JTextField();
        tf2.setBounds(150,100,150,30);
        l3=new JLabel("DOB");
        l3.setBounds(50,150,60,30);
        String[] day_arr=new String[31];
        for(int i=1;i<=31;i++)
            day_arr[i-1]=Integer.toString(i);
            day=new JComboBox(day_arr);
            day.setBounds(150,150,50,25);

            String[] mon_arr={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            month=new JComboBox(mon_arr);
            month.setBounds(220,150,70,25);

        String[] year_arr=new String[70];
        for(int i=1951;i<=2020;i++)
            year_arr[i-1951]=Integer.toString(i);
            year=new JComboBox(year_arr);
            year.setBounds(310,150,60,25);

        l4=new JLabel("Gender");
        l4.setBounds(50,200,60,30);
        male=new JRadioButton("Male");
        male.setBounds(150,200,80,30);
        female=new JRadioButton("FeMale");
        female.setBounds(250,200,80,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);

        l5=new JLabel("Address");
        l5.setBounds(50,250,60,30);
        ta=new JTextArea();
        ta.setBounds(150,250,230,50);
        cb=new JCheckBox("I accept all terms and conditions");
        cb.setBounds(50,320,250,25);
        btn=new JButton("Submit");
        btn.setBounds(100,355,80,40);

        btn.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  submit_action(e);
                              }
                              });
        output=new JTextArea();
        output.setBounds(400,50,300,350);


        cntr.add(l1);
        cntr.add(tf1);
        cntr.add(l2);
        cntr.add(tf2);
        cntr.add(l3);
        cntr.add(day);
        cntr.add(month);
        cntr.add(year);
        cntr.add(l4);
        cntr.add(male);
        cntr.add(female);
        cntr.add(l5);
        cntr.add(ta);
        cntr.add(cb);
        cntr.add(btn);
        cntr.add(output);
    }
    public static void submit_action(ActionEvent e)
    {
        if(cb.isSelected()==true)
        {
            String name=l1.getText();
            String mobile=l2.getText();
            String day_name=(String)day.getSelectedItem();
            String month_name=(String)month.getSelectedItem();
            String year_name=(String)year.getSelectedItem();
            String gen="Male";
            if(female.isSelected()==true)
                gen="Female";
            String address=l5.getText();
            output.setText("Name "+name+"\nMobile "+mobile+"\nDOB "+day_name+" "+month_name+" "+year_name+
                           "\nGender "+gen+"\nAddress "+address);
        }
        else{
            output.setText("Please accept terms and Conditions");
        }
    }
}
