import java.rmi.*;
import java.io.*;
public class Client2
{
public static void main(String args[])
{
try{
BankI stub=(BankI)Naming.lookup("rmi://127.0.0.1:1099/bank");
while(true)
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("\n1.Account holder\n2.Deposit\n3.Withdraw\n4.balance\n5.Exit\n");
System.out.print("Enter your choice:");
int i=Integer.parseInt(br.readLine());
switch(i)
{
case 1:
String s=stub.getName();
System.out.println("Account Holder is "+s);
break;
case 2:
System.out.println("Enter the amount to be deposited");
float a=Float.parseFloat(br.readLine());
stub.deposit(a);
float db=stub.balance();
System.out.println("Balance="+db);
break;
case 3:
System.out.println("Enter the amount to be withdrawed");
float w=Float.parseFloat(br.readLine());
float wb=stub.balance();
if(wb<w)
System.out.println("Insuffient balance\n");
else
stub.withdraw(w);
float wb1=stub.balance();
System.out.println("Balance="+wb1);
break;
case 4:
float b=stub.balance();
System.out.println("Balance="+b);
break;
case 5:
System.exit(0);
 }
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

