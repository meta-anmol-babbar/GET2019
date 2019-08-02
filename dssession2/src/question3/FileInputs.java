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
	Queue<StudentList> students = new LinkedList<>();

	/**
	 * readProgramFile reads a Excel file that is predefined by the user
	 * 
	 * @throws IOException
	 * @throws BiffException
	 */
	public void readProgramFile(String programFile) throws IOException, BiffException {
		String filePath = programFile;
		FileInputStream fs = new FileInputStream(filePath);
		Workbook wb = Workbook.getWorkbook(fs);

		Sheet sheet = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sheet.getRows();
		if (totalNoOfRows == 0)
			throw new AssertionError("Empty File found");
		for (int row = 0; row < totalNoOfRows; row++) {
			Cell cell1 = sheet.getCell(0, row);
			Cell cell2 = sheet.getCell(1, row);
			programList.put(cell1.getContents().toString(),
					Integer.parseInt(cell2.getContents().toString()));

		}
	}

	/**
	 * readStudentsFile reads a Excel file that is predefined by the user
	 * 
	 * @throws IOException
	 * @throws BiffException
	 */
	public void readStudentsFile(String studentFile) throws IOException, BiffException {

		String filePath = studentFile;
		FileInputStream fs = new FileInputStream(filePath);
		Workbook wb = Workbook.getWorkbook(fs);

		Sheet sheet = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sheet.getRows();
		if (totalNoOfRows == 0)
			throw new AssertionError("Empty File found");

		for (int row = 0; row < totalNoOfRows; row++) {
			Cell cell1 = sheet.getCell(0, row);
			List<String> pref = new ArrayList<String>(5);
			for (int col = 0; col < 5; col++) {
				Cell cell2 = sheet.getCell(col + 1, row);

				pref.add(cell2.getContents().toString());

			}
			this.students.add(new StudentList(cell1.getContents().toString(),
					pref));
		}

	}

	void print() {
		System.out.println(students.size());
		for (StudentList stu : students) {
			System.out.println(stu.stuName);
			for (int i = 0; i < stu.preference.size(); i++) {
				System.out.print(stu.preference.size());
				System.out.print(" " + stu.preference.get(i) + " ");
			}
			System.out.println();

		}
	}
}
