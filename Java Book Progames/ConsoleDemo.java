import java.io.Console;
public class ConsoleDemo {
    public static void main(String[]args){
        Console c = System.console();
        String login = c.readLine("Login : ");
        char[] password = c.readPassword("Password : ");
        System.out.println(login+" "+(new String(password)));
    }
}
