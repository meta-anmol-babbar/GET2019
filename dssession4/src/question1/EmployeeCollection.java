package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EmployeeCollection {
	ArrayList<Employee> empCollection = new ArrayList<Employee>();
	HashSet<Integer> empId = new HashSet<Integer>();

	/**
	 * addEmployee add employee totheemployeelist if it doesnot exists
	 * 
	 * @param emp
	 *            is object of Employee class
	 * @return String Message
	 */
	String addEmployee(Employee emp) {
		if (!checkEmployee(emp.empId)) {
			empId.add(emp.empId);
			empCollection.add(emp);
			return "New Employee Added";
		} else
			return "Employee alredy exists";

	}

	/**
	 * This methods checks wether eloyee alredy exists or not
	 * 
	 * @param id
	 *            is the employee id
	 * @return boolean
	 */
	boolean checkEmployee(Integer id) {
		if (empId.contains(id)) {
			return true;
		}

		return false;

	}

	/**
	 * this methods sorts the list of employee in natural order here natural
	 * order means on the basis of employee id It uses Collections.sort with
	 * Overridden Comparator
	 */
	void employeeSortedOrderId() {
		Collections.sort(empCollection, new sortOnId());
		print();
	}

	/**
	 * this methods sorts the list of employee on basis of name in ascending
	 * order It uses Collections.sort with Overridden Comparator
	 */
	void employeeSortedOrderName() {
		Collections.sort(empCollection, new sortOnName());
		print();

	}

	/**
	 * this methods is used to print all the employees data
	 */
	void print() {
		System.out
				.println("-----------------------------------------------------------------");
		System.out.format("|\t%-10s|\t%-15s|\t%-15s|\n", "Id", "Name",
				"Address");
		System.out
				.println("-----------------------------------------------------------------");
		for (Employee employee : empCollection) {
			System.out.format("|\t%-10d|\t%-15s|\t%-15s|\n", employee.empId,
					employee.empName, employee.empaddress);
			System.out
					.println("-----------------------------------------------------------------");
		}
	}
}