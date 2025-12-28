import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WritingServer {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello, this is WritingServer!");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = reader.readLine();
            System.out.println("Response from server: " + response);
            socket.close();
            out.close();

        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
