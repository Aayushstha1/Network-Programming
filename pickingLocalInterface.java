// import java.io.IOException;
// import java.net.InetAddress;
// import java.net.Socket;

// public class pickingLocalInterface {
//     public static void main(String[] args) throws IOException {
//         try{
//             InetAddress localAddress = InetAddress.getByName("https://github.com/Aayushstha1");
//             int i;
//             for(int i= 1024; i<=65535; i++){

//             Socket socket=new Socket("localhost",5000, localAddress,i);

//         }
//         catch(Exception ex){
//             ex.printStackTrace();
        
//         }
//     }

        
    
    
// }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class pickingLocalInterface {
    public static void main(String[] args) throws Exception {
        try {
            InetAddress address = InetAddress.getByName("localhost");
            int i;
            for (i = 1024; i < 65535; i++) {
                Socket socket = new Socket("localhost", 5000, address, 0);
                BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println();
                if (socket.isConnected()) {
                    System.out.println("Connected with localhost:" + socket.getInputStream());
                }
                socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}