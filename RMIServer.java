public class RMIServer {
    public static void main(String[] args) {
        try {
           implementation obj = new implementationRMI();
           HelloRMI stub = (HelloRMI) UnicastRemoteObject.exportObject(obj, 0);
           Registry registry = LocateRegistry.getRegistry();
              registry.bind("HelloRMI", stub);
                System.out.println("RMI Server ready");
        } catch (Exception e) {
            System.err.println("RMI Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
