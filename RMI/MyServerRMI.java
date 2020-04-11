import java.rmi.*;
import java.rmi.registry.*;
public class MyServerRMI
{
	public static void main(String args[])
	{
		try
		{
			Adder stub=new AdderRemote();
			Naming.rebind("rmi://localhost:5000/abc",stub);
			System.out.println("Server Started");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}