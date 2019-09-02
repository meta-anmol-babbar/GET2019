package com.metacube.eadsession3;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;



public class StudentQuery {
	protected DbConnectivity mysqlconn;
	protected Connection con;
	protected Statement stmt;
	
	
	
	public StudentQuery() {
		try {
			 mysqlconn = new DbConnectivity("students","root","abc123");
			 con = (Connection) mysqlconn.getConnection();
			 stmt = (Statement) con.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addStudentDetails(String fName,String lName,String fatherName,int age,int studentClass){
		int rs = 0;
		String query="insert into studentDetails (FirstName,LastName,FatherName,Age,Class) "
				+ "values ('"+fName+"','"+lName+"','"+fatherName+"',"+age+","+studentClass+");";
		
		try{
			rs = stmt.executeUpdate(query);
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return rs;
	}
	
	public List<Student> getAllStudents(){
		ResultSet rs;
		List<Student> studentList = new ArrayList<Student>();
		String query = "select student_id,FirstName,LastName,FatherName,Age,Class "
				+ "from StudentDetails;";
		try{
			rs=(ResultSet) stmt.executeQuery(query);
			while(rs.next()){
				Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				studentList.add(student);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
		return studentList;
		
	}
	public int UpdateStudentDetails(int id,String fName,String lName,String fatherName,int age,int studentClass){
		int rs = 0;
		String query="update studentDetails set FirstName='"+fName+"', LastName = '"+lName+"' , FatherName = '"+fatherName+"', Class = "+studentClass+", Age = "+age+""
				+ " where student_id = '"+id+"';";
				
		
		try{
			rs = stmt.executeUpdate(query);
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return rs;
	}

	public List<Student> seacrhByFirstName(String firstName,int studentClass) {
		ResultSet rs;
		String query=null;
		List<Student> studentList = new ArrayList<Student>();
		if(studentClass>0){
		query = "select student_id,FirstName,LastName,FatherName,Class,Age "
				+ "from StudentDetails where FirstName='"+firstName+"' AND Class = '"+ studentClass +"' ;";
		}
		else {
			query = "select student_id,FirstName,LastName,FatherName,Class,Age "
					+ "from StudentDetails where FirstName='"+firstName+"';";
		}
		try{
			rs=(ResultSet) stmt.executeQuery(query);
			while(rs.next()){
				Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				studentList.add(student);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
		return studentList;
		
	}
	public List<Student> seacrhByLastName(String LastName,int studentClass) {
		ResultSet rs;
		String query = null;
		List<Student> studentList = new ArrayList<Student>();
		if(studentClass>0){
		query = "select student_id,FirstName,LastName,FatherName,Class,Age "
				+ "from StudentDetails where LastName='"+LastName+"' AND Class = '"+ studentClass +"' ;";
		}
		else {
			query = "select student_id,FirstName,LastName,FatherName,Class,Age "
					+ "from StudentDetails where LastName='"+LastName+"';";
		}
		try{
			rs=(ResultSet) stmt.executeQuery(query);
			while(rs.next()){
				Student student = new Student(rs.getInt("Student_id"),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				studentList.add(student);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
		return studentList;
		
	}
	public List<Student> seacrhByFirstAndLastName(String firstName,String lastName,int studentClass) {
		ResultSet rs;
		String query=null;
		List<Student> studentList = new ArrayList<Student>();
		if(studentClass>0){
		query = "select student_id,FirstName,LastName,FatherName,Class,Age "
				+ "from StudentDetails where FirstName='"+firstName+"' AND LastName='"+lastName+"'AND Class = '"+ studentClass +"' ;";
		}
		else {
			query = "select student_id,FirstName,LastName,FatherName,Class,Age "
					+ "from StudentDetails where FirstName='"+firstName+"' AND LastName='"+lastName+"';";
		}
		try{
			rs=(ResultSet) stmt.executeQuery(query);
			while(rs.next()){
				Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				studentList.add(student);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
		return studentList;
		
	}

	public List<Student> seacrhByClass(int studentClass) {
		ResultSet rs;
		String query=null;
		List<Student> studentList = new ArrayList<Student>();
		
		query = "select student_id,FirstName,LastName,FatherName,Class,Age "
				+ "from StudentDetails WHERE Class = '"+ studentClass +"' ;";
		
		try{
			rs=(ResultSet) stmt.executeQuery(query);
			while(rs.next()){
				Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				studentList.add(student);
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
		return studentList;
	}

}
