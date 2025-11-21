
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class webserverLogfile {
    public static void main(String[] args)throws Exception {
        try(FileInputStream fin=new FileInputStream("C:\\Users\\Aayush\\Desktop\\Network programming\\webserver.log");
         InputStreamReader rd=new InputStreamReader(fin);
        BufferedReader breader=new BufferedReader(rd);){
        try{
        for(String entry=breader.readLine(); entry!=null; entry=breader.readLine()){
            int d=entry.indexOf(' ');
            String ip=entry.substring(0, d);
            String theTest=entry.substring(d);
            
            InetAddress address=InetAddress.getByName(ip);
            System.out.println(ip);
            System.out.println("address:"+address.getHostName()+address+theTest+"");

          }
        }catch(Exception ex){
            ex.printStackTrace();
        }}
    }
}