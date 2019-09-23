package question2;

public class EmployeeList {
	Employee root;
	Employee sortedRoot;

	/**
	 * Constructor to initialise list
	 */
	public EmployeeList() {
		root = null;
		sortedRoot = null;
	}

	/**
	 * This method is used to add a Employee in the linked list.
	 * 
	 * @param employeeName
	 *            name of employee
	 * @param employeeAge
	 *            age of employee
	 * @param employeeSalary
	 *            salary of employee
	 */
	public void addEmployee(String employeeName, int employeeAge,
			double employeeSalary) {
		Employee newEmployee = new Employee(employeeName, employeeAge,
				employeeSalary);

		if (root == null) {
			root = newEmployee;
			return;
		}
		Employee temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newEmployee;

	}

	/**
	 * This method sorts the given employee list with insertion sort method
	 */
	void sortEmployeeList() {
		Employee currentEmployee = root;
		while (currentEmployee != null) {
			Employee nextEmployee = currentEmployee.next;
			if ((sortedRoot == null)
					|| (sortedRoot.getEmployeeSalaray() <= currentEmployee
							.getEmployeeSalaray())) {
				if (sortedRoot == null) {
					currentEmployee.next = sortedRoot;
					sortedRoot = currentEmployee;
				} else if (sortedRoot.getEmployeeSalaray() < currentEmployee
						.getEmployeeSalaray()) {
					currentEmployee.next = sortedRoot;
					sortedRoot = currentEmployee;
				} else if ((sortedRoot.getEmployeeSalaray() == currentEmployee
						.getEmployeeSalaray())
						&& (sortedRoot.getEmployeeAge() > currentEmployee
								.getEmployeeAge())) {
					currentEmployee.next = sortedRoot;
					sortedRoot = currentEmployee;
				} else {
					Employee temp = sortedRoot;
					while ((temp.next != null)
							&& (temp.next.getEmployeeSalaray() == currentEmployee
									.getEmployeeSalaray())
							&& (temp.next.getEmployeeAge() < currentEmployee
									.getEmployeeAge())) {
						temp = temp.next;
					}
					currentEmployee.next = temp.next;
					temp.next = currentEmployee;
				}
			} else {
				Employee temp = sortedRoot;
				while ((temp.next != null)
						&& (temp.next.getEmployeeSalaray() >= currentEmployee
								.getEmployeeSalaray())) {
					if ((temp.next.getEmployeeSalaray() == currentEmployee
							.getEmployeeSalaray())
							&& temp.next.getEmployeeAge() < currentEmployee
									.getEmployeeAge()) {
						temp = temp.next;
					} else if (temp.next.getEmployeeSalaray() > currentEmployee
							.getEmployeeSalaray()) {
						temp = temp.next;
					}
				}

				temp.next = currentEmployee;
				temp.next.next = null;
			}
			currentEmployee = nextEmployee;
		}

	}
}
