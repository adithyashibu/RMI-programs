import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class server1
{
public static void main(String args[])
{
try{
    LocateRegistry.createRegistry(1099);
    ComplexC cs=new ComplexC();
    Naming.rebind("rmi://127.0.0.1:1099/Comp",cs);
    }catch(Exception e)
        {
           System.out.println(e);
        }
}
}