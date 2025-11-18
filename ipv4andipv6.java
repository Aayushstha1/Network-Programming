import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class ipv4andipv6 {
    public static void main(String[] args) {
        try{
         InetAddress addr = InetAddress.getByName("www.google.com");
         if(addr instanceof Inet4Address){
            System.out.println("this is Inet4Address");
         }

         if(addr instanceof Inet6Address){
            System.out.println("this is Inet6Address");
            Inet6Address ipv6 = (Inet6Address)addr;
            if(ipv6.isIPv4CompatibleAddress()){
                System.out.println("This address is compatible for ipv4");
            }else{
                System.out.println("This address is not compatible for  ipv6");
            }

         }

        }catch(Exception ex){

        }
    }
    
}
