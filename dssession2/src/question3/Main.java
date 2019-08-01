package question3;

import java.io.IOException;

import jxl.read.biff.BiffException;

public class Main {

	public static void main(String[] args) throws BiffException, IOException {

		FileInputs fi=new FileInputs();
		BranchAllocation b=new BranchAllocation();
		
		fi.readProgramFile();
		fi.readStudentsFile();
		b.branchAllot();
		//fi.print();
//		System.out.println(fi.students.size());
//		for(StudentList stu :fi.students){
//			System.out.println(stu.stuName);
//			System.out.println(stu.branch);
//		}
		
	}

}
