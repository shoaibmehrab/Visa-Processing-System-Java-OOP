package _LAB_project_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnect {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	
	public DBconnect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			st =con.createStatement(); 
		} catch (Exception e) {
			System.out.println("Error : "+e);
		}
	}
	
	public void getdata()
	{
		try{
			String query = "Detect * from persons";
			rs=st.executeQuery(query);
			System.out.println("Records from Database ");
			while(rs.next())
			{
				String name=rs.getString("name");
				String pasword=rs.getString("password");
				System.out.println("Name : "+name+"  "+"password : "+pasword);
			}
			
			
		}catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}
