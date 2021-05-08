import java.lang.reflect.Modifier;
public class GetClassModifiers {

    public static void main(String[] args) {
        try {

            Class c = Class.forName("java.lang.String");
            System.out.println("Modifiers for " + "java.lang.String" + ": ");
            System.out.println(Modifier.toString(c.getModifiers()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
