import java.rmi.*;
import java.rmi.server.*;
public class BankC extends UnicastRemoteObject implements BankI
{
String name;
float bal;
public BankC() throws RemoteException
{
super();
name="adithya";
bal=100000;
}
public String getName() throws RemoteException
{
return name;
}
public float balance()throws RemoteException
{
return bal;
}
public void withdraw(float amt)throws RemoteException
{
bal=bal-amt;
}
public void deposit(float amt)throws RemoteException
{
bal=bal+amt;
}
}