import javax.naming.Context;
import javax.naming.InitialContext;
public class CalculatorServerJNDI {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            SimpleCalculator cal = new SimpleCalculator();
            Context context = new InitialContext();
            context.rebind("Calculator", cal);
            System.out.println("Calculator Server Ready.............");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
