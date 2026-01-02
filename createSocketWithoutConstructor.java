import java.io.BufferedReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class createSocketWithoutConstructor {
    public static void main(String[] args) throws Exception {
        try{
            Socket socket=new Socket();
            InetSocketAddress address=new InetSocketAddress("localhost",5000);
            // SocketAddress intSocketAddress;
            socket.connect(address);
            BufferedReader rd=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Connected to server: "+rd.readLine());
            if(socket.isConnected()){
                System.out.println("Socket is connected"+ socket.getInetAddress());
            }


        }catch(Exception ex){
            ex.printStackTrace();
        
    }
    
}
}
