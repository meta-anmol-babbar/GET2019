package question3;


import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This class contains main
 */
public class MainDriver {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		EmployeeLinkedList listObj = new EmployeeLinkedList();

		String moreInput="";
		int choice = 0;
		do{
			System.out.println("Enter Your Choice\n1.Add an Employee\n2.Sort and Display Employee List\n0.Exit");
			try{
				choice = sc.nextInt();
				switch(choice){
				case 1:
					do{
						sc.nextLine();
						System.out.println("Enter Employee Name :");
						String name = sc.nextLine();
						System.out.println("Enter Employee Age");
						int age = sc.nextInt();
						System.out.println("Enter Employee Salary :");
						int salary = sc.nextInt();
						Employee emp = new Employee(name, age, salary);
						listObj.insertEmployee(emp);
						System.out.println("Employee " + name + " added in the list\n");
						System.out.println("Do you want to enter more [y/n]");
						moreInput=sc.next();
					}while(moreInput.equals("y"));
					break;
				case 2:
					listObj.quickSort();
					Node temp = listObj.getHead() ;
					System.out.println("Employee Name\tEmployee Age\tEmployee Salary");
					while(temp!=null) {
						System.out.println(temp.employee.getName()+"\t\t"+temp.employee.getAge()+"\t\t"+temp.employee.getSalary());
						temp=temp.next;
					}
					
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("\nInvalid Choice  !! Try Again\n");
				}
				sc.nextLine();
			}catch(InputMismatchException exception){
				System.out.println("\nWarning , Please Enter only correct data Value \n");
				sc.nextLine();
			}
		}while(choice != 0);
	}



}