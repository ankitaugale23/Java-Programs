import java.net.*;
import java.io.*;
public class DatagramClient 
{
	static byte[] buffer=new byte[1024];
	public static DatagramSocket ds;
	public static BufferedReader br;
	private static int clientport=789;
	private static int serverport=790;
	public static void main(String args[]) throws Exception
	{
		ds=new DatagramSocket(clientport);
		while(true)
		{
			DatagramPacket p=new DatagramPacket(buffer,buffer.length);
			ds.receive(p);
			String str=new String(p.getData(),0,p.getLength());
			System.out.println(str);
			
		}
	}
}
	