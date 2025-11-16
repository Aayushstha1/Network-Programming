import java.net.InetAddress;

public class Testingreachability {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            if(address.isReachable(300)){
                System.out.println("this machine is rechable");
            }
            else{
                System.out.println("this machine is not rechable");
            }

        } catch (Exception ex ) {
            System.err.println(ex);
        }
    }
    
}
