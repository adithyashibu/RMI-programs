import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImp extends UnicastRemoteObject implements Calculator {
    public CalculatorImp() throws RemoteException {
        // Required constructor
    }
    public int add(int a, int b) throws RemoteException
     {
        return a + b;
    }
}
