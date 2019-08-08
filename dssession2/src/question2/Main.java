package question2;

import java.util.Scanner;


public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws Exception {

		int choice, item;
		sc = new Scanner(System.in);
		CircularQueue queue = new CircularQueue(5);

		do {
			System.out.println("\n1.Insert an element");
			System.out.println("2.Delete an element");
			System.out.println("3.Display an element");
			System.out.println("4.Check Queue is empty or Full or Has Elementss");
			System.out.println("0.Quit");

			System.out.print("Enter your choice : ");
			choice = Integer.parseInt(sc.next());

			switch (choice) {
			case 1:
				System.out.print("\nInput the element for insertion in queue : ");
				item = Integer.parseInt(sc.next());
				System.out.println(queue.addItem(item));
				break;
			case 2:
				System.out.println(queue.deleteItem());
				break;
			case 3:
				System.out.println("\nThe queue is : ");
				queue.print();
				break;
			case 4:
				System.out.println(queue.checkEmptyOrFull());
				break;
			default:
				System.out.println("Wrong choice\n");
			}
		} while (choice != 0);

	}

}


