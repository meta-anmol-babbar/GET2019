package question3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FileInputs {

	Map<String, Integer> programList = new HashMap<String, Integer>();
	static Queue<StudentList> students = new LinkedList<>();
	
	
	public Map<String, Integer> getProgramList() {
		return programList;
	}

	public void setProgramList(Map<String, Integer> programList) {
		this.programList = programList;
	}

	public static Queue<StudentList> getStudents() {
		return students;
	}

	public static void setStudents(Queue<StudentList> students) {
		FileInputs.students = students;
	}

	public void readProgramFile() throws IOException, BiffException {
		String filePath = "PROGRAMS.xls";
		FileInputStream fs = new FileInputStream(filePath);
		Workbook wb = Workbook.getWorkbook(fs);

		Sheet sheet = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sheet.getRows();

		for (int row = 0; row < totalNoOfRows; row++) {
			Cell cell1=sheet.getCell(0,row);
			Cell cell2=sheet.getCell(1,row);
			programList.put(cell1.getContents().toString(), Integer.parseInt(cell2.getContents().toString()));

		}
			//System.out.println(programList.values());
		}
	
	public void readStudentsFile() throws IOException, BiffException {
		
		String filePath = "STUDENTS.xls";
		FileInputStream fs = new FileInputStream(filePath);
		Workbook wb = Workbook.getWorkbook(fs);

		Sheet sheet = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sheet.getRows();

		for (int row = 0; row < totalNoOfRows; row++) {
			Cell cell1=sheet.getCell(0,row);
			List<String> pref = new ArrayList<String>(5);
			for(int col=0;col<5;col++) {
			Cell cell2=sheet.getCell(col+1,row);
			
			pref.add(cell2.getContents().toString());
			
					}
				this.students.add(new StudentList(cell1.getContents().toString(), pref));
				//pref.clear();
		}
		
		
		}
	void print(){
	//	System.out.println(students.size());
		//for(StudentList stu:students){	
			//System.out.println(stu.stuName);
			//for(int i=0; i< stu.preference.size();i++){
				//System.out.print(stu.preference.size());
				//System.out.print(" "+stu.preference.get(i)+" ");}
		//	System.out.println();
			

	//}
	}
}


