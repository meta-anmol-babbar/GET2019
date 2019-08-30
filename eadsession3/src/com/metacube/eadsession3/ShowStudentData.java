package com.metacube.eadsession3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowStudentData
 */
@WebServlet("/ShowStudentData")
public class ShowStudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentData() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentQuery sq=new StudentQuery();
		List<Student> allStudents = new ArrayList<Student>();
		allStudents=sq.getAllStudents();
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");

		// build HTML code
			String htmlRespone = "<html>";
			htmlRespone += "<head>";
			htmlRespone += "<style>"
					+ "table{ table-layout: fixed;"
					+ "  width: 1000px;}"
					+ "td,th{ "
					+ "padding: 10px;}"
					+ "</style>";
			htmlRespone += "</head>";
			htmlRespone += "<body> "
					+ "<div><table border=1px> <tr>"
					+ "<td> Student Id </td>"
					+ "<td> First Name </td>"
					+ "<td> Last Name</td>"
					+ "<td> Father's Name </td>"
					+ "<td> Class </td>"
					+ "<td> Age </td>"
					+ "<td> Option </td>"
					+ "</div>";
			
			for(Student student : allStudents){
				htmlRespone += "<div>"
					+ "<form action=UpdateServlet method='get'>"
					+ "<table border=1px> <tr> "
					+ "<input id=Id name=studentId value= '"+ student.getStudent_id() +"'>"
					+ "<input id=firstName name=firstName value='"+ student.getFirstName() +"'>"
					+ "<input id=lastName name=lastName value= '"+ student.getLastName() +"'>"
					+ "<input id=fatherName name=fatherName value= '"+ student.getFatherName()+"'>"
					+ "<input id=studentClass name=studentClass value= "+ student.getStudentClass() +">"
					+ "<input id=studentAge name=studentAge value= "+ student.getAge() +">"
					+ "<input type= submit value = Update id='"+student.getStudent_id()+"' name='"+student.getFirstName()+"'>"
					+ "</tr>"
					+ "</div></form>";
			}
			htmlRespone += "</body>";
			htmlRespone += "</html>";

		// return response
			writer.println(htmlRespone);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
