//InetAddress with its factory methods:
import java.net.*;
public class DemoInet
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr);
	addr=InetAddress.getByName("google.com");
	InetAddress sw[]=InetAddress.getAllByName("www.google.com");
	for(int i=0;i<sw.length;i++)
	{
		System.out.println(sw[i]);
	}
	String name=addr.getHostName();
	System.out.println(name);
	String address=addr.getHostAddress();
	System.out.println(address);

	
	}
}
