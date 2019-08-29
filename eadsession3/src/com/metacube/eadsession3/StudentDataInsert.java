package com.metacube.eadsession3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;


/**
 * Servlet implementation class StudentDataInsert
 */
public class StudentDataInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentQuery sq = new StudentQuery();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentDataInsert() {
		super();
		
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		String fName = null,lName = null,fatherName = null,output;
		int studentClass=0,age=0 ,rs=0;
		try{
		fName = request.getParameter("firstName");
		lName = request.getParameter("lastName");
		fatherName = request.getParameter("fatherName");
		studentClass = Integer.parseInt(request.getParameter("class"));
		age  = Integer.parseInt(request.getParameter("age"));
		
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		rs=sq.addStudentDetails(fName, lName, fatherName, studentClass, age);
		if(rs==1){
			output="Dtata Successfully Inserted";
		}
		else
			output="Please Check The Data Inserted";
		

		// do some processing here...

		// get response writer
		PrintWriter writer = response.getWriter();

		// build HTML code
		String htmlRespone = "<html>";
		htmlRespone += "<h2>result is :" + output +" <br/>";
		htmlRespone += "</html>";

		// return response
		writer.println(htmlRespone);

	}
}
