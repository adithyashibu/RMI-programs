import java.rmi.*;
public interface BankI extends Remote
{
String getName()throws RemoteException;
float balance()throws RemoteException;
void withdraw(float amt)throws RemoteException;
void deposit(float amt)throws RemoteException;
}