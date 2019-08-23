package question3;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * this class contains methods for allotting a branch to a student and also to
 * generate a excel sheet of the same
 * 
 */
public class BranchAllocation {
	Queue<StudentList> students = new LinkedList<>();

	/**
	 * branchAllot compares between preferences and availability of branchs and
	 * assign branches on the basis of it to a student
	 * 
	 * @return a Queue of students
	 * @throws BiffException
	 * @throws IOException
	 */
	public void branchAllot(String studentFile, String programFile)
			throws BiffException, IOException {
		
		FileInputs fi = new FileInputs();
		fi.readStudentsFile(studentFile);
		fi.readProgramFile(programFile);

		while (fi.students.size() != 0) {

			StudentList stu = fi.students.remove();
			for (String pref : stu.preference) {
				int val = fi.programList.get(pref);
				if (val > 0) {
					stu.branch = pref;
					students.add(stu);
					fi.programList.put(pref, val - 1);
					break;
				}
			}

		}
		
	}

	/**
	 * makeExcelSheet creates Excel sheet of the generated allocation list
	 */
	String makeExcelSheet() {
		try {

			WritableWorkbook workbook = Workbook.createWorkbook((new File(
					"Allocation.xls")));
			WritableSheet workbookSheet = workbook.createSheet("sheet1", 0);
			int j = 0;
			for (StudentList student : students) {
				String name = student.stuName;
				Label nameLabel = new Label(0, j, name);
				workbookSheet.addCell(nameLabel);
				String program = student.branch;
				Label programLabel = new Label(1, j, program);
				j++;
				workbookSheet.addCell(programLabel);

			}

			workbook.write();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Excelsheet made";
	}
	
	void print(){
		
		for(StudentList student:students){
			System.out.print("name ->"+student.stuName+"\t");
			System.out.println("branch ->"+student.branch);
		}
	}
}
