import java.rmi.*;
import java.rmi.server.*;
public class AdderRemote extends UnicastRemoteObject implements Adder
{
	public AdderRemote() throws RemoteException
	{
		super();
	}
	public int add(int x,int y) throws RemoteException
	{
		return (x+y);
	}
}