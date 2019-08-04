package question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeCollectionTest {

	EmployeeCollection empCollection = new EmployeeCollection();

	@Test
	public void testAddEmployeePositive() {
		
		assertEquals("New Employee Added", empCollection.addEmployee(new Employee(1,
				"Anmol", "Jaipur")));
		
		assertEquals("New Employee Added", empCollection.addEmployee(new Employee(11,	//positive test
				"Anshul", "Delhi")));
	}
	
	@Test
	public void testAddEmployeeNegetive() {
		
		assertEquals("New Employee Added", empCollection.addEmployee(new Employee(1,
				"Anmol", "Jaipur")));
		assertEquals("Employee alredy exists", empCollection.addEmployee(new Employee(1,		//negitive Test
				"Anmol", "Jaipur")));
		
		
	}
}
