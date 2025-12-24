import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class URLOpenConnectionExample {

    public static void main(String[] args) throws Exception {
        URL url= new URL("https://www.w3schools.com/html/html_intro.asp");
        URLConnection con = url.openConnection();
        con.connect();
        System.out.println(new Date(con.getDate()));
        if(con.getDoInput()){
            System.out.println(con.getContent());
        }
    }
}