//server socket...
import java.net.*;
import java.io.*;
public class MyServer
{
	ServerSocket s;
	Socket soc;
	BufferedReader br,br1;
	
	public MyServer() throws Exception
	{
		s=new ServerSocket(1234);
		
		
		while(true)
		{
			soc=s.accept();
			System.out.println("got client..");
			br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str=br.readLine();
			System.out.println(str);
			br1=new BufferedReader(new InputStreamReader(System.in));
			String str1=br1.readLine();
			PrintWriter pw=new PrintWriter(soc.getOutputStream());
			pw.println(str1);
			boolean b1=pw.checkError();
		}
	}
	public static void main(String args[]) throws Exception
	{
		new MyServer();
	}
}