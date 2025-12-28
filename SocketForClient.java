import java.io.BufferedReader;
import java.io.InputStream;
import java.net.Socket;

public class SocketForClient {

    public static void main(String[] args) {        
        try {
            Socket socket = new Socket("https://www.w3schools.com/html/html_intro.asp", 5000);
            socket.setSoTimeout(3000);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        
    }
}