package com.metacube.eadsession3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentQuery sq = new StudentQuery();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fName = null, lName = null, fatherName = null, output, error = null;
		int studentId = 0;
		int studentClass = 0, age = 0, rs = 0;
		try {
			studentId = Integer.parseInt(request.getParameter("studentId"));
			fName = request.getParameter("firstName");
			lName = request.getParameter("lastName");
			fatherName = request.getParameter("fatherName");
			studentClass = Integer.parseInt(request
					.getParameter("studentClass"));
			age = Integer.parseInt(request.getParameter("studentAge"));

		} catch (NullPointerException npe) {
			error = "value Missing";
		} catch (Exception e) {
			error = "Unknown error occured";

		}
		PrintWriter writer = response.getWriter();

		response.setContentType("text/html");

		// build HTML code
		String htmlRespone = "<html>";
		htmlRespone += "<head>";
		htmlRespone += "<style>" + "td,th{ " + "padding: 10px;}" + "</style>";
		htmlRespone += "</head>";
		htmlRespone += "<body> "
				+ "<div>"
				+ "<form name=UpdateDetailForm action=UpdateServlet method=post >"
				+ "<table border=1px> "
				+ "<tr>"
				+ "<td> Student Id </td>"
				+ "<td><input type= text name=studentId id=stuId readonly value ="
				+ studentId
				+ "> </td>"
				+ "</tr><tr>"
				+ "<td> First Name </td>"
				+ "<td><input type= text name=firstName id=fname value ='"
				+ fName
				+ "'></td>"
				+ "</tr><tr>"
				+ "<td> Last Name</td>"
				+ "<td><input type= text name=lastName id=fname value ='"
				+ lName
				+ "'></td>"
				+ "</tr><tr>"
				+ "<td> Father's Name </td>"
				+ "<td><input type= text name=fatherName id=fathername value ='"
				+ fatherName
				+ "'></td>"
				+ "</tr><tr>"
				+ "<td> Class </td>"
				+ "<td><input type= text name=studentClass id=stuClass value ='"
				+ studentClass
				+ "'></td>"
				+ "</tr><tr>"
				+ "<td> Age </td>"
				+ "<td><input type= text name=studentAge id=studentAge value ='"
				+ age
				+ "'></td>"
				+ "</tr><tr>"
				+ "<td  colspan=2 ><input type=submit value=Update Details></td>"
				+ "</tr>" + "</div>";
		htmlRespone += "</body>";
		htmlRespone += "</html>";

		// return response
		writer.println(htmlRespone);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		PrintWriter out = response.getWriter();
		String fName = null, lName = null, fatherName = null, output, error = null;
		int studentId = 0;
		int studentClass = 0, age = 0, rs = 0;
		try {
			studentId = Integer.parseInt(request.getParameter("studentId"));
			fName = request.getParameter("firstName");
			lName = request.getParameter("lastName");
			fatherName = request.getParameter("fatherName");
			studentClass = Integer.parseInt(request
					.getParameter("studentClass"));
			age = Integer.parseInt(request.getParameter("studentAge"));
			rs = sq.UpdateStudentDetails(studentId, fName, lName, fatherName,
					age, studentClass);
			if (rs == 1) {
				out.println("<p><b><font color=blue>"
						+ "Data Success fully Updated" + "</font></b></p><br>");
				response.sendRedirect("ShowStudentData");

			}
		} catch (NullPointerException npe) {
			error = "value Missing";
		} catch (Exception e) {
			error = "Unknown error occured";
		}

	}

}
