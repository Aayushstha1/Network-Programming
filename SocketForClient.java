import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SocketForClient {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.w3schools.com/html/html_intro.asp");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(5000);
            conn.setRequestMethod("GET");
            conn.connect();

            InputStream input = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}