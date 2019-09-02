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
		
			htmlRespone += "</head>";
			htmlRespone += "<body> "
					+ "<table border=1px> <tr>"
					+ "<td> Student Id </td>"
					+ "<td> First Name </td>"
					+ "<td> Last Name</td>"
					+ "<td> Father's Name </td>"
					+ "<td> Class </td>"
					+ "<td> Age </td>"
					+ "<td> Option </td>"
					+ "</tr>"
					+ "";
			
			for(Student student : allStudents){
				System.out.println(student.getAge());
				htmlRespone += ""
					+ "<tr><form action=UpdateServlet method='get'>"
					+ "<td><input type=text id=Id name=studentId value= '"+ student.getStudent_id() +"' readonly></td>"
					+ "<td><input type=text id=firstName name=firstName value='"+ student.getFirstName() +"' readonly></td>"
					+ "<td><input type=text id=lastName name=lastName value= '"+ student.getLastName() +"' readonly></td>"
					+ "<td><input type=text id=fatherName name=fatherName value= '"+ student.getFatherName()+"' readonly></td>"
					+ "<td><input type=text id=studentClass name=studentClass value= "+ student.getStudentClass() +" readonly></td>"
					+ "<td><input type=text id=studentAge name=studentAge value= "+ student.getAge() +" readonly></td>"
					+ "<td><input type= submit value = Update id='"+student.getStudent_id()+"' name='"+student.getFirstName()+"'></td>"
					+ "</tr>"
					+ "</form>";
			}
			htmlRespone += "</table>"
					+ "<form form action=index.html>"
					+ "<input type=submit value=Home>"
					+ "</form>"
					+ "</body>";
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
