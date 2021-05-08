import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;     // Declare input Label
   private Label lblOutput;    // Declare output Label
   private TextField tfInput;  // Declare input TextField
   private TextField tfOutput; // Declare output TextField
   private int sum = 0;
    public AWTAccumulator() {
      setLayout(new FlowLayout());
      lblInput = new Label("Enter an Integer: "); // Construct Label
      add(lblInput);               // "super" Frame container adds Label component
      tfInput = new TextField(10); // Construct TextField
      add(tfInput);                // "super" Frame adds TextField
      tfInput.addActionListener(this);
      lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
      add(lblOutput);               // "super" Frame adds Label
      tfOutput = new TextField(10); // allocate TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);                // "super" Frame adds TextField
      setTitle("AWT Accumulator");  // "super" Frame sets title
      setSize(350, 120);  // "super" Frame sets initial window size
      setVisible(true);   // "super" Frame shows
   }
   public static void main(String[] args) {
      new AWTAccumulator();
   }
   public void actionPerformed(ActionEvent evt) {
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText(sum + "");
   }
}
