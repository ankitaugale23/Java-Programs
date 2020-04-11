import java.net.*;
import java.io.*;
public class DatagramServer 
{
	static DatagramSocket soc;
	public static byte[] buffer=new byte[1024];
	static BufferedReader br;
	public static int clientport=789;
	public static int serverport=790;
	public static void main(String args[]) throws Exception
	{
		soc=new DatagramSocket(serverport);
		InetAddress ia=InetAddress.getByName("localhost");
		br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			
			String str=br.readLine();
			buffer=str.getBytes();
			DatagramPacket p=new DatagramPacket(buffer,str.length(),ia,clientport);
			soc.send(p);
		}
	}
}