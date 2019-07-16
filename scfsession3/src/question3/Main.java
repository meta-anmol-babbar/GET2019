package question3;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int choice;
		double value;
		Scanner input = new Scanner(System.in);
		Area calculate = new Area();

		do {

			System.out
					.println("Enter your choice \n 1: Triangle Area\n 2: Rectangle Area\n 3: Circle Area\n 4: Square Area\n 5:exit");
			choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter base of triangle");
				double base = Double.parseDouble(input.next());
				System.out.println("Enter height of triangle");
				double height = Double.parseDouble(input.next());
				value=calculate.triangleArea(base, height);
				calculate.print("Triangle area",value);
				break;
			case 2:
				System.out.println("Enter length of rectangle");
				double length = Double.parseDouble(input.next());
				System.out.println("Enter width of rectangle");
				double width = Double.parseDouble(input.next());
				value=calculate.rectangleArea(length, width);
				calculate.print("Rectangle Area",value);
				break;
			case 3:
				System.out.println("Enter radius of circle");
				double radius = Double.parseDouble(input.next());
				value=calculate.circleArea(radius);
				calculate.print("Circle Area",value);
				break;
			case 4:
				System.out.println("Enter side of Square");
				double side = Double.parseDouble(input.next());
				value=calculate.squareArea(side);
				calculate.print("Square Area",value);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 5);
	input.close();
	}
	

}