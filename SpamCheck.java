import java.net.InetAddress;

public class SpamCheck {
            public static String BLACKHOLE = "sbl.spamhaus.org";

    public static void main(String[] args) {
        System.out.println("java");
    }
    private static boolean IsSpammer(String arg){
       try{

         InetAddress addr = InetAddress.getByName("www.google.com");
        byte[] baddr = addr.getAddress();
        String query= BlackHole;
        for(byte octet:quad){
            int ubyte= octet<0 ? octet+256:octet;
        }

       } catch(Exception ex){

       }

    }
}
