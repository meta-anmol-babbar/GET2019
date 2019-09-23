package question2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class tests the methods of EmployeeList class.
 *
 */
public class EmployeeListTest {

	@Test
	public void test1() {
		EmployeeList employeeList = new EmployeeList();

		employeeList.addEmployee("anmol", 22, 30000);
		employeeList.addEmployee("Ajay", 22, 45000);
		employeeList.addEmployee("Aman", 23, 15000);
		employeeList.addEmployee("mahendar", 22, 25000);
		employeeList.addEmployee("jugal", 22, 25000);

		employeeList.sortEmployeeList();

		assertEquals("Ajay", employeeList.sortedRoot.getEmployeeName());
	}
}