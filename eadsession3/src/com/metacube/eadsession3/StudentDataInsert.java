package com.metacube.eadsession3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      this servlet is used to insert data of students into database
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
		rs=sq.addStudentDetails(fName, lName, fatherName, age,studentClass);
		}
		catch(NullPointerException npe){
			rs=0;
		}
		catch (Exception e) {
			rs=0;
		}
		
		if(rs==1){
			output="Data Successfully Inserted";
		}
		else{
			output="Incorrect Data Inserted...!! Please Try Again ";
		}
		
		RequestDispatcher rd = null;
		PrintWriter out= response.getWriter();
		
		out.println("<p><b><font color=red>"+output+"</font></b></p><br>");
		rd = request.getRequestDispatcher("index.html");
		rd.include(request, response);
		
	}
}
