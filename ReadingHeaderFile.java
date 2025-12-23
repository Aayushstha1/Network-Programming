import java.net.*;
import java.util.Date;

public class ReadingHeaderFile {
    public static void main(String[] args)  throws Exception {
        URL url = new URL("https://www.w3schools.com/html/html_intro.asp");
        URLConnection uc = url.openConnection();
        System.out.println("Content Type: " + uc.getContentType());

        if(uc.getContentLength() != -1) {
            System.out.println("Content Length: " + uc.getContentLength());
        } else if (uc.getDate()!=0) {
            System.out.println("getDate: " +  new Date (uc.getDate()));
        } else if (uc.getExpiration()!=0) {
            System.out.println("Expiration: " +  new Date(uc.getExpiration()));
        }  else if (uc.getLastModified()!=0) {
            System.out.println("Last Modified: " + new Date(uc.getLastModified()));
        } else {
            System.out.println("No content information");
        }

    }

    
}
