import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class singleHttpServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("HTTP Server is listening on port 8080");

        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            File file = new File("singleHttp.html");

            if (file.exists()) {
                // Logic to read the file and send HTTP response
                PrintWriter writer =
                        new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

                BufferedReader fBufferReader =
                        new BufferedReader(new FileReader(file));

                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html");

                StringBuilder content = new StringBuilder();
                String line;

                while ((line = fBufferReader.readLine()) != null) {
                    content.append(line).append("\n");
                }

                writer.println("Content-Length: " + content.length());
                writer.println();
                writer.println(content.toString());
                writer.flush();

                fBufferReader.close();
                socket.close();
            }
        }
    }
}
