import java.net.URL;

public class urlmethod {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http ","www.w3schools.com", 80, "/css/default.asp", null );
        // System.out.println(url.getAuthority());
        // System.out.println(url.getContent());
        // System.out.println(url.getFile());
        // System.out.println(url.getHost());
        System.out.println("Host" + url.getHost());
        System.out.println("Port" + url.getPort());
        System.out.println("Protocol" + url.getProtocol());
        System.out.println("Authority" + url.getAuthority());
        System.out.println("file" + url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());



            
      

    } 
        
    }
    

