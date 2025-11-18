// import java.net.NetworkInterface;
// import java.util.Enumeration;

// public class GetterNetworkInterface {
//     public static void main(String[] args)  throws Exception {
//         NetworkInterface ni = NetworkInterface.getByName("www.google.com");
//         Enumeration e=ni.getInetAddress();
//         System.out.println(e);
//         while (e.hasMoreElements()) {
//             System.out.println(e.nextElement());
            
//         }


        
//     }
    
// }

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.net.InetAddress;

public class GetterNetworkInterface {
    public static void main(String[] args)  throws Exception {
        NetworkInterface ni = NetworkInterface.getByName("www.google.com");

        if (ni == null) {
            System.out.println("Network interface not found!");
            return;   // prevents NullPointerException
        }

        Enumeration<InetAddress> e = ni.getInetAddresses();
        System.out.println(e);

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
