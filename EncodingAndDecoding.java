import java.net.URLEncoder;

public class EncodingAndDecoding {
    public static void main(String[] args) throws Exception {
        String text = "Hello@Aayush";
        System.out.println(URLEncoder.encode(text, "UTF-8"));
        String Hari = "Hello#_hari";
        System.out.println(URLEncoder.encode(Hari, "utf-8"));
    }
    
}
