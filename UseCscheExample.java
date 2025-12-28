import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UseCscheExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.w3schools.com/html/html_intro.asp");
        URLConnection uc = url.openConnection();
        uc.setUseCaches(true);
        uc.connect();
        System.out.println("Use Caches: " + uc.getUseCaches());
    }
    
}
