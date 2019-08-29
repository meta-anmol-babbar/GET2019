package com.metacube.eadsession3;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class StudentQuery {
	protected DbConnectivity mysqlconn;
	protected Connection con;
	protected Statement stmt;
	int rs;
	
	
	public StudentQuery() {
		try {
			 mysqlconn = new DbConnectivity("students","root","abc123");
			 con = (Connection) mysqlconn.getConnection();
			 stmt = (Statement) con.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addStudentDetails(String fName,String lName,String fatherName,int studentClass,int age){
		String query="insert into studentDetails (FirstName,LastName,FatherName,Class,Age) "
				+ "values ('"+fName+"','"+lName+"','"+fatherName+"',"+studentClass+","+age+");";
		
		try{
			rs = stmt.executeUpdate(query);
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return rs;
	}

}
