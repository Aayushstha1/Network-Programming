
import java.net.InetAddress;

public class TestingAddressType2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
            if(address.isAnyLocalAddress()){
                System.out.println(address + "is a wildcard address.");
            }else if(address.isLinkLocalAddress()){
                System.out.println(address + "is a link to local address.");
            }else if(address.isLoopbackAddress()){
                System.out.println(address + "is a loop back address.");
            }else if(address.isSiteLocalAddress()){
                System.out.println(address + "is a site local address.");
            }else if(address.isMulticastAddress()){
                if(address.isMCGlobal()){
                    System.out.println(address + "mc global address");
                } else if(address.isMCSiteLocal()) {
                    System.out.println(address + "is a mc site local address");
                } else if(address.isMCLinkLocal()) {
                    System.out.println(address + "is a mc link local address");
                } else if(address.isMCOrgLocal()) {
                    System.out.println(address + "is a mc org local address");
                }
            } else {
                System.out.println(address + "It is unicast addres");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
