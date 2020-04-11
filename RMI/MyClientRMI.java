import java.rmi.*;
public class MyClientRMI
{
	public static void main(String args[])
	{
		try
		{
			Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/abc");
			System.out.println(stub.add(25,5));
		}
		catch(Exception e)
		{
		}
	}
}	