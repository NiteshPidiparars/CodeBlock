import javax.naming.Context;
import javax.naming.InitialContext;
public class CalculatorClientJNDI {
    public static void main(String[] args) {
        try{
            Context context = new InitialContext();
            Calculator cal = (Calculator) context.lookup("Calculator");
            int x = 2, y = 3;
            System.out.println("Sent : "+x+" and "+y);
            int result = cal.add(x, y);
            System.out.println("Received : "+result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
