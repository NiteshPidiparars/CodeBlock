import java.awt.*;
import java.awt.event.*;
public class AWTCounter extends Frame implements ActionListener {
   private Label lblCount;    // Declare a Label component
   private TextField tfCount; // Declare a TextField component
   private Button btnCount;   // Declare a Button component
   private int count = 0;     // Counter's value
   public AWTCounter () {
      setLayout(new FlowLayout());
      Label lblCount = new Label("Counter");  // construct the Label component
      add(lblCount);                    // "super" Frame container adds Label component
      TextField tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
      tfCount.setEditable(true);       // set to read-only
      add(tfCount);
      btnCount = new Button("Count"); // construct the Button component
      add(btnCount);                    // "super" Frame container adds Button component

      btnCount.addActionListener(this);
      setTitle("AWT Counter");  // "super" Frame sets its title
      setSize(300, 200);        // "super" Frame sets its initial window size
      setVisible(true);         // "super" Frame shows
   }
   public static void main(String[] args) {
      AWTCounter app = new AWTCounter();
   }
   public void actionPerformed(ActionEvent evt) {
      ++count; // Increase the counter value
      tfCount.setText(count + ""); // Convert int to String
   }
}
