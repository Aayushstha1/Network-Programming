import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SenderMulticast {
    public static void main(String[] args) throws Exception {
        int port = 8000;
        try{
            InetAddress group = InetAddress.getByName("localhost");
            String messege = "Hello Multicast";
            byte[] buffer = messege.getBytes();
            DatagramSocket socket = new DatagramSocket(buffer, buffer.length, group,  port );
            MulticastSocket socket = new MulticastSocket();
            System.out.println("Messege sent " + message );
            socket.send(packet);
        } catch(Exception e ){
            e.printStackTrace();
        }
        }
       
}
