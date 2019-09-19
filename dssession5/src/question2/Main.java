package question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeList listObj = new EmployeeList();

		String moreInput = "";
		int choice = 0;
		do {
			System.out.println("Enter Your Choice\n" + "1.Add an Employee\n"
					+ "2.Sort\n" + "0.Exit");
			try {
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					do {
						sc.nextLine();
						System.out.println("Enter Employee Name :");
						String name = sc.nextLine();
						System.out.println("Enter Employee Age");
						int age = sc.nextInt();
						System.out.println("Enter Employee Salary :");
						double salary = sc.nextDouble();
						listObj.addEmployee(name, age, salary);
						System.out.println("Employee " + name
								+ " added in the list\n");
						System.out.println("Do you want to enter more [y/n]");
						try {
							moreInput = sc.next();
						} catch (InputMismatchException ime) {
							System.out
									.println("\nPlease Enter only correct data Value \n");
							sc.nextLine();
						}
					} while (moreInput.equals("y"));
					break;
				case 2:
					listObj.sortedRoot = null;
					listObj.sortEmployeeList();
					System.out.println("List Sorted successfully \n");

					Employee tempSorted = listObj.sortedRoot;
					System.out
							.println("Employee Name\tEmployee Age\tEmployee Salary");
					while (tempSorted != null) {
						System.out.println(tempSorted.employeeName + "\t\t"
								+ tempSorted.employeeAge + "\t\t"
								+ tempSorted.employeeSalary);
						tempSorted = tempSorted.next;
					}
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("\nInvalid Choice  !! Try Again\n");
				}
				sc.nextLine();
			} catch (InputMismatchException exception) {
				System.out.println("\nPlease Enter only correct data Value here \n");
			}
		} while (true);
	}

}
