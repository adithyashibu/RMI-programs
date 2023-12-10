import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Calculator calculator = new CalculatorImp();
            Naming.rebind("CalculatorService", calculator);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
