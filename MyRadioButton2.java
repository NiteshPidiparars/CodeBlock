import java.awt.*;
import javax.swing.*;
class MyRadioButton2
{
    public static void main(String[]args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,700,500);

        Container cntr=frame.getContentPane();
        cntr.setLayout(null);

        JRadioButton radio=new JRadioButton("Male");
        radio.setBounds(100,50,100,30);
        JRadioButton radio1=new JRadioButton("FeMale");
        radio1.setBounds(200,50,100,30);

        ButtonGroup gender=new ButtonGroup();
        gender.add(radio);
        gender.add(radio1);

        radio.setEnabled(false);//option should be disable or enable only on set(true=enabled,false=disabled)

        JRadioButton gen=new JRadioButton("General");
        gen.setBounds(100,100,100,30);

        JRadioButton obc=new JRadioButton("OBC");
        obc.setBounds(200,100,100,30);

        JRadioButton st=new JRadioButton("ST");
        st.setBounds(300,100,100,30);

        JRadioButton sc=new JRadioButton("SC");
        sc.setBounds(400,100,100,30);



        ButtonGroup cat=new ButtonGroup();
        cat.add(gen);
        cat.add(obc);
        cat.add(st);
        cat.add(sc);

        obc.setEnabled(false);//obc should be disabled

        cntr.add(radio);
        cntr.add(radio1);
        cntr.add(gen);
        cntr.add(obc);
        cntr.add(st);
        cntr.add(sc);
    }
}


