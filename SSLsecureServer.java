import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class SSLsecureServer {
    public static void main(String[] args) throws Exception {

        SSLServerSocketFactory factory =
                (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();

        SSLServerSocket serverSocket =
                (SSLServerSocket) factory.createServerSocket(5000);

        System.out.println("SSL Secure Server is running on port 5000");

        SSLSocket socket = (SSLSocket) serverSocket.accept();

        BufferedReader rd =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter pr =
                new PrintWriter(socket.getOutputStream(), true);

        String msg;

        while (true) {
            msg = rd.readLine();
            System.out.println("Client says: " + msg);

            pr.println("SSL Secure Server is running on port 5000");
            pr.println("Client says: " + msg);
            pr.flush();
        }
    }
}
