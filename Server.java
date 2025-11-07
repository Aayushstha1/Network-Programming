import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is running...");

            Socket socket = serverSocket.accept(); 
            System.out.println("Client connected: " + socket.getInetAddress());

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            writer.println("Hello from the server!");

            writer.close();
            socket.close();
            serverSocket.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
