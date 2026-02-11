import java.io.ByteArrayInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendingUDPDta {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            byte[] buffer = new byte[1024];

            DatagramPacket recive = new DatagramPacket(buffer, buffer.length);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(recive.getData());
            int readByte;
            while((readByte = inputStream.read()) != -1){
                System.out.print((char) readByte);
            }
            // sending data 
            buffer = "Hello from sendingFil".getBytes();
            DatagramPacket send = new DatagramPacket(buffer, buffer.length, address, 12345);
            socket.send(send);
            System.out.println("msg of recived "+ receive.getLength());
            inputStream.close();
        } catch(Exception e){
            System.out.println(ex);
    }
    
}
}
