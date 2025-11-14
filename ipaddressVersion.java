import java.net.*;
public class ipaddressVersion {
    public static int  getVersion(  InetAddress addr){
       byte[] bytes = addr.getAddress();
       if (bytes.length == 4){
           return 4;

        } 
         else {
              return 6;
    
          }

    }
     public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            int v = getVersion(addr);
            System.out.println("IP version : " + v);
        } catch(Exception ex){
            System.err.println(ex);
        }
    }
}
       