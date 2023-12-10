import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ComplexI extends Remote
{
 Complex add(Complex c1,Complex c2)throws RemoteException;
 Complex subtract(Complex c1,Complex c2)throws RemoteException;
 Complex multiply(Complex c1,Complex c2)throws RemoteException;
}