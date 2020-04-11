//Socket class and its methods...
import java.net.*;
public class DemoSocketMethods 
{
	public static void main(String args[]) throws UnknownHostException,Exception
	{
		Socket s=new Socket("internic.net",43);
		int a=s.getPort();
		System.out.println(a);
		a=s.getLocalPort();
		System.out.println(a);
		InetAddress addr=s.getInetAddress();
		System.out.println(addr);
	}
}