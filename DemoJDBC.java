import java.sql.*;
import javax.sql.*;
import java.util.*;
public class DemoJDBC 
{
	public static void main(String args[]) throws SQLException
	{
	try
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ankita");
		System.out.println(con);
		Scanner sc=new Scanner(System.in);
		ResultSet rs;
		Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into practical values(?,?)");
		System.out.println("enter data for 5 students");
		int i;
		for(int a=0;a<5;a++)
		{
			
			ps.setInt(1,sc.nextInt());
			ps.setString(2,sc.next());
					 i=ps.executeUpdate();
					 
		if(i>0)
		{
			
			
			
		}
		}	
		

		rs=st.executeQuery("select * from practical");
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				
			}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}