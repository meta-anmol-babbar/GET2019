package question1;

import java.util.*;
/**
 * Driver class to run the zoo management system
 * @author Anmol
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ZooOperations zooOperations=new ZooOperations();
		int choice1,choice2;
		String name;
		
		do{
			System.out.println("Select Option \n1. add zone \n2. add animal \n3. remove animal\n4. display animals");
			System.out.println("enter your choice..");
			choice1=sc.nextInt();
			switch(choice1){
				case 1:
					System.out.println("ZoneCategores are : Mammals, Reptiles, Birds");
					zooOperations.addZone();
						break;
					
				case 2:
					System.out.println("enter the type of animal you want to add : \n1.Lion\n2.Crocodile\n3.Peacock");
				    choice2=sc.nextInt();
				    switch(choice2){
				    case 1: zooOperations.addAnimal("mammals","lion");
				    		break;
				    case 2: zooOperations.addAnimal("reptiles","crocodile");
				            break;
				    case 3: zooOperations.addAnimal("birds","peacock");
				    		break;
				    default : System.out.println("wrong choice , pls try again.. ");
				    }
				    	break;
					
				case 3: 
					System.out.println("enter the name of animal you want to remove");
				    name=sc.next();
				    zooOperations.removeAnimal(name);
						break;
					
				case 4 :
					zooOperations.display();
						break;
				case 0:
					System.exit(0);
						break;
				default:
					System.out.println("Wrong Input");
						break;
			}
		}while(choice1 != 0 );
		
		sc.close();

	}

}
