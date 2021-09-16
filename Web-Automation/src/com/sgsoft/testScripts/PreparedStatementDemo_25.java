package com.sgsoft.testScripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class PreparedStatementDemo_25 {

	public static void main(String[] args) {
		fetchRecordsFromDatabse();
	//	insertRecordsDemo();
	}
	
	static void fetchRecordsFromDatabse()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "System", "VSGOMADI");
			
			String sQuery="select * from dept";
			
			PreparedStatement stmt=conn.prepareStatement(sQuery);
			ResultSet rs=stmt.executeQuery(sQuery);
			ResultSetMetaData rsmeta=rs.getMetaData();
			String col1=rsmeta.getColumnName(1);
			String col2=rsmeta.getColumnName(2);
			String col3=rsmeta.getColumnName(3);
			System.out.printf("%-12s",col1);
			System.out.printf("%-12s",col2);
			System.out.printf("%-12s",col3);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String dname=rs.getString("DNAME");
				String loc=rs.getString("LOC");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",dname);
				System.out.printf("%-12s",loc);
				System.out.printf("\n");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	static void insertRecordsDemo()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "System", "VSGOMADI");
			
			String sQuery="insert into dept values(80,'EDUCATION','RAICHUR')";
			PreparedStatement stmt=conn.prepareStatement(sQuery);
			
			stmt.executeUpdate(sQuery);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
