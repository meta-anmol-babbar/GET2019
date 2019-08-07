package question2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringMethods stringOperations = new StringMethods();
		String input;

		int choice = 0;
		do {
			System.out.println("1.To Check Unique Characterin String \n"
					+ "2. Print Cache \n" + "0. Exit \n");
			System.out.print("Enter your choice : ");
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("\n Wrong Choice \n");
				
			}

			switch (choice) {
			case 1:
				System.out.println("Enter String");
				input = br.readLine();
				System.out.println(stringOperations.checkString(input));
				break;

			case 2:
				stringOperations.printCache();
				break;
				
			case 0: 
				System.exit(0);
				break;
			
			default :
				System.out.println("\n Wrong Choice \n");
			}
		} while (choice != 0);

	}
}
