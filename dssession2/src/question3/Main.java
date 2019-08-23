package question3;

import java.io.IOException;
import jxl.read.biff.BiffException;

public class Main {

	public static void main(String[] args) throws BiffException, IOException {

		BranchAllocation b=new BranchAllocation();
		b.branchAllot("STUDENTS.xls","PROGRAMS.xls");
		b.print();
		System.out.println(b.makeExcelSheet());
		
		
	}

}
