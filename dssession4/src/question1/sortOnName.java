package question1;

import java.util.Comparator;

public class sortOnName implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		return emp1.empName.compareTo(emp2.empName);
	}

}
