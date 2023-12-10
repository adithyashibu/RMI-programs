import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class Server2
{
public static void main(String args[])
{
try{
     LocateRegistry.createRegistry(1099);
BankC ob=new BankC();
Naming.rebind("rmi://127.0.0.1:1099/bank",ob);
System.out.println("server is ready");
 }
catch(Exception e)
{
System.out.println(e);
}
}
}