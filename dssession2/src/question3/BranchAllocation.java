package question3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class BranchAllocation {
	Map<String, String> allocationList = new HashMap<String, String>();

	public void branchAllot() throws BiffException, IOException {
		// System.out.println("in allot");

		FileInputs fi = new FileInputs();
		fi.readStudentsFile();
		fi.readProgramFile();

		while (fi.students.size() != 0) {
			StudentList stu = fi.students.remove();
			for (String pref : stu.preference) {
				int val = fi.programList.get(pref);
				if (val > 0) {
					// System.out.println(stu.stuName);
					stu.branch = pref;
					// System.out.println(stu.branch);
					// allocationList.put(stu.stuName, pref);
					fi.programList.put(pref, val - 1);
					break;
				}
			}
			
		}
		

	}

}
