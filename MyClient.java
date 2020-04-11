//client socket...
import java.io.*;
import java.net.*;
public class MyClient 
{
	Socket s;
	BufferedReader br,br1;
	String str,str1;
	public MyClient() throws Exception
	{
		while(true)
		{
		s=new Socket("localhost",1234);
		br=new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println(str);
		System.out.println(pw.checkError());
		br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
		str1=br1.readLine();
		System.out.println(str1);
		}
	}
	public static void main(String args[]) throws Exception	
	{
		new MyClient();
	}
}