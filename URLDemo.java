//url demo
import java.net.*;
import java.io.*;
import java.util.Date;
public class URLDemo 
{
		public static void main(String args[]) throws MalformedURLException,IOException
		{
			URL hp=new URL("http://www.google.com/downloads");
			System.out.println("port:"+hp.getPort());
			System.out.println("Host:"+hp.getHost());
			System.out.println("file:"+hp.getFile());
			System.out.println("Protocol:"+hp.getProtocol());
			System.out.println("Ext:"+hp.toExternalForm());
			URLConnection hp1=hp.openConnection();
			long d=hp1.getDate();
			System.out.println("Date is:"+new Date(d));
			//get content type...
			System.out.println("Content type:"+hp1.getContentType());
			d=hp1.getExpiration();
			System.out.println("Expiration is:"+new Date(d));
			d=hp1.getLastModified();
			System.out.println("Last modified"+new Date(d));
			int len=hp1.getContentLength();
			System.out.println("Length of content:"+len);
			
		}
}
	