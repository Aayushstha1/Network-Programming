import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SSLsecureClient {
    public static void main(String[] args) throws Exception {

        SSLSocketFactory factory =
                (SSLSocketFactory) SSLSocketFactory.getDefault();

        SSLSocket socket =
                (SSLSocket) factory.createSocket("localhost", 5000);

        socket.startHandshake();

        BufferedReader rd =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter pr =
                new PrintWriter(socket.getOutputStream(), true);

        while (true) {
            pr.println("hello server");
            pr.flush();

            String msg = rd.readLine();
            System.out.println("Server says: " + msg);
        }
    }
}
