import java.rmi.RemoteException;

public class HelloRMI extends Remote {
    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }
    
}
