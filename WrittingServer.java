import java.io.*;
import java.net.*;
public class WrittingServer {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",5000);
            OutputStream os=socket.getOutputStream();
            PrintWriter pr=new PrintWriter(os,true);
           
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
             pr.println("Hello from WrittingServer");
            String serverMsg, cmsg;
            while (true) {
                serverMsg = br.readLine();
                if (serverMsg == null || serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("server disconnected");
                    break;
                }
                
            

            System.out.println("Response from server: "+serverMsg);
            System.out.println("Client Messsege");
            cmsg=reader.readLine();
            pr.println(cmsg);
            }
            br.close();
            pr.close();
            socket.close();
        }catch(Exception ex){
            ex.printStackTrace();}
    }
}