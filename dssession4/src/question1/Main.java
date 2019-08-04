package question1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * This class handles the UI part of the QueueImplementation class
 */
public class Main {

	private static Scanner sc;
	Console con = System.console();

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int id = 0, choice;
		String name, location;

		EmployeeCollection empCollection = new EmployeeCollection();
		
		do {
			System.out.println("\n1.Insert New Employee \n"
					+ "2.Display All Employee \n"
					+ "3.Sort Employee in Natural Order \n"
					+ "4.Sort Employee in Alphabetic Order \n" 
					+ "0.Quit \n");

			System.out.print("Enter your choice : ");
			choice = Integer.parseInt(in.readLine());

			switch (choice) {
			case 1:

				System.out.print("\nEnter Employee Id ");
				try {
					id = Integer.parseInt(in.readLine());
				} catch (Exception e) {
					System.out
							.println("Invalid Format for Id...... Please enter numeric value");
					break;
				}
				if (empCollection.checkEmployee(id)) {
					System.out.println("Employee Id Alredy Present In System");
					break;
				}
				System.out.print("\nEnter Employee Name ");
				name = in.readLine();

				System.out.print("\nEnter Employee Location ");
				location = in.readLine();

				System.out.println(empCollection.addEmployee(new Employee(id,
						name, location)));
				break;
			case 2:
				empCollection.print();
				break;
			case 3:
				System.out.println("\nEmployee list Sorted by id is : ");
				empCollection.employeeSortedOrderId();
				break;
			case 4:
				System.out.println("\nEmployee list Sorted by Name is : ");
				empCollection.employeeSortedOrderName();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Wrong choice\n");
			}
		} while (choice != 0);

	}

}