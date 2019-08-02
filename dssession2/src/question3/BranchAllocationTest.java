package question3;

import static org.junit.Assert.*;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.junit.Test;

public class BranchAllocationTest {
	BranchAllocation allot;

	

	@Test
	public void testBranchAllocation() throws BiffException, IOException {  //Positive Test
		allot=new BranchAllocation();
		allot.branchAllot("STUDENTS.xls", "PROGRAMS.xls");
		assertEquals("Excelsheet made", allot.makeExcelSheet());
	}
	
	@Test(expected=AssertionError.class)
	public void testBranchAllocationNegetive1() throws BiffException, IOException {	//Negative Test
		allot=new BranchAllocation();
		allot.branchAllot("STUDENTS_EMPTY.xls", "PROGRAMS.xls");		//Entering Empty Students File
		assertEquals("Excelsheet made", allot.makeExcelSheet());
	}
	
	@Test(expected=AssertionError.class)
	public void testBranchAllocationNegetive2() throws BiffException, IOException { //Negetive Case
		allot=new BranchAllocation();
		allot.branchAllot("STUDENTS.xls", "PROGRAMS_EMPTY.xls");		//Entering Empty Programs File
		assertEquals("Excelsheet made", allot.makeExcelSheet());
	}
}
