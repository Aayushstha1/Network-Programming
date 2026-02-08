import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;

public class ReceiverMulticast extends DatagramSocket {
    public ReceiverMulticast() throws SocketException {
        super();
    }

    public static void main(String[] args) throws Exception {
        int port = 8000;
        MulticastSocket Msocket= new MulticastSocket(port);
        InetAddress group= InetAddress.getByName("230.0.0.1");
        // NetworkInterface ni = NetworkInterface.getByName("en0");
        // if(ni!= null) {
        //     Msocket.setNetworkInterface(ni);
        //     SocketAddress sa = new InetSocketAddress(InetAddress.getByName("10.169.123.38"), port);
        //     Msocket.joinGroup(sa, ni);
        // }else{
                    Msocket.joinGroup(group);
        byte[] buffer = new byte[1000];
        while (true) {
            Msocket.receive(new java.net.DatagramPacket(buffer, buffer.length));
            String msg = new String(buffer);
            System.out.println("Received: " + msg);
            
        }
    }
}