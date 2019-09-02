package com.metacube.eadsession3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class SearchStudentData
 */
@WebServlet("/SearchStudentData")
public class SearchStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStudentData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentQuery sq=new StudentQuery();
		String queryString = null ,firstName="",lastName = "";
		ResultSet resultSet =null;
		int studentClass = 0;
		
		List<Student> searchList = new ArrayList<Student>();
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		try{
		firstName = request.getParameter("firstName");
		lastName = request.getParameter("lastName");
		studentClass=Integer.parseInt(request.getParameter("studentClass"));
		}
		catch(NumberFormatException nfe){
			studentClass=0;
		}
		catch (NullPointerException npe) {
			firstName="";
			lastName="";
		}
		catch (Exception e) {
			firstName="";
			lastName="";
		}
		if("".equals(lastName) && "".equals(firstName)){
			System.out.println("IN SEARCH BY CLASS");
			searchList = sq.seacrhByClass(studentClass);
		}
		else if("".equals(firstName)  ){
			searchList =sq.seacrhByLastName(lastName,studentClass);
		}
		else if("".equals(lastName)){
			System.out.println("IN SEARCH BY F");
			 searchList =sq.seacrhByFirstName(firstName,studentClass);
		}
		else{
			searchList =sq.seacrhByFirstAndLastName(firstName, lastName,studentClass);
		}
		
		try {
		
			// build HTML code
			String htmlRespone = "<html>";
			htmlRespone += "<head>";
			htmlRespone += "</head>";
			htmlRespone += "<body> "
					+ "<table border=1px> <tr>"
					+ "<td> Student Id </td>"
					+ "<td> First Name </td>"
					+ "<td> Last Name</td>"
					+ "<td> Father's Name </td>"
					+ "<td> Age </td>"
					+ "<td> Class </td>"
					+ "</tr>"
					+ "";
					
		       

    
						for(Student student :searchList){
							htmlRespone += ""
								+"<td><input type=text id=Id name=studentId value= '"+ student.getStudent_id() +"' readonly></td>"
								+ "<td><input type=text id=firstName name=firstName value='"+ student.getFirstName() +"' readonly></td>"
								+ "<td><input type=text id=lastName name=lastName value= '"+ student.getLastName() +"' readonly></td>"
								+ "<td><input type=text id=fatherName name=fatherName value= '"+ student.getFatherName()+"' readonly></td>"
								+ "<td><input type=text id=studentClass name=studentClass value= "+ student.getStudentClass() +" readonly></td>"
								+ "<td><input type=text id=studentAge name=studentAge value= "+ student.getAge() +" readonly></td>"
								+ "</tr>"
								+ "</form>";
						}
						
						htmlRespone += "</table>";
						htmlRespone+="<form form action=index.html>"
										+ "<input type=submit value=Home>"
										+ "</form>";
								
						htmlRespone += "</body>"
								+ "</html>";


					// return response
					out.println(htmlRespone);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
