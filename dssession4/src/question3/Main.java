package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MolecularMassCalculator m =new MolecularMassCalculator();
		int choice=0;
		String compund;
		do{
			System.out.println("Enter Choice \n\t1. Check Molecular Mass \n\t0. Exit");
			try {
				choice=Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Invalid Choice");
			}
			switch (choice) {
			case 1:
				System.out.println("Enter compund Formula");
				compund=br.readLine();
				System.out.println(m.calculateCompoundMass(compund));
				break;
			
			case 0:
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
				break;
			}
		
		}while(choice!=0);
	}

}
