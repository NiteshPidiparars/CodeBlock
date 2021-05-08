import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interface implements ActionListener{

    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JTextField textfield;
    private JTextField textfield2;
    private JTextField textfield3;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JPanel panel;

    public static void main(String[] args){
        new Interface();
    }
    public Interface()
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10,10,600,600);
        panel.setLayout(null);

        label = new JLabel("Button 1");
        label.setBounds(5,5,600,20);

        label2 = new JLabel("Button 2");
        label2.setBounds(5,5,600,20);

        label3 = new JLabel("Button 3");
        label3.setBounds(5,5,600,20);

        textfield = new JTextField();
        textfield.setBounds(5,30,100,20);

        JButton button = new JButton("circle");
        button.setBounds(130,30,100,20);
        button.addActionListener(this);

        JButton button2 = new JButton("Driehoek");
        button2.setBounds(250,30,100,20);
        button2.addActionListener(this);

        JButton button3 = new JButton("vierhoek");
        button3.setBounds(370,30,100,20);
        button3.addActionListener(this);

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        frame.add(panel);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent arg0)
    {
            panel.add(label);
            panel.add(textfield);
            panel.validate();
            panel.repaint();
            String text = textfield.getText();

            // Van de String 'text' een double maken
            double diameter = Double.parseDouble(text);

            circle C1 = new circle();
            C1.setDiam(diameter);
            label.setText("De diameter = " + C1.getDiam() + " cm \n\n");
            label.setText("De straal = " + C1.getRadius() + " cm");
            label.setText("De oppervlakte van de cirkel = " + C1.berekenOpp() + " cm2");
    }
}
