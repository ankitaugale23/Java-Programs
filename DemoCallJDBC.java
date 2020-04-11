import java.sql.*;
import javax.sql.*;
import java.io.*;
public class DemoCallJDBC
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ankita");
			System.out.println("Connection done");
			CallableStatement  call1=con.prepareCall("{call update2(?,?)}");
			call1.setInt(1,101);
			call1.setString(2,"kiran");
			call1.execute();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from practical");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
			
			