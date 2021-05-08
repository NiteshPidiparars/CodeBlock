import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author hp
 */
public class URLReadDemo {
    public static void main(String[]args) throws MalformedURLException, IOException{
        int c;
        URL url = new URL(args[0]);
        java.io.InputStream in = url.openStream();
        while((c = in.read()) != -1)
            System.out.println((char)c);
        in.close();
    }
}
