package com.test.utilities;

import java.sql.*;

public class DBUtils {
	
	public Connection con;
	public Statement st;
	public ResultSet rs;
	
	public void updateDB(String sql)
	{
		try
		{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection("jdbc:sqlserver://loalhost;databaseName=sa;user=sa;password=sa");
		st=con.createStatement();
		st.executeUpdate(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
	}
	
	public ResultSet getResults(String sql)
	{
		try
		{
			Class.forName("com.microsoft.sqlsever.jdbc.SQlServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=sa;user=sa;password=sa");
			st=con.createStatement();
			rs=st.executeQuery(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return rs;
}
}
