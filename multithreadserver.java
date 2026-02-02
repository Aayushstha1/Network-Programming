import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;

public class multithreadserver  extends Thread {
    public static void main(String[] args) throws Exception {

        ServerSocket sSocket  = new ServerSocket(5000);
        System.out.println("Server is listening on port 5000");
        Socket s = sSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        while((rd.readLin))
    }
}
