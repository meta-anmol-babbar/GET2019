package question1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		String strValue1=new String();
		String strValue2=new String();
		int choice=0;
		Scanner sc=new Scanner(System.in);
		StringOperations s=new StringOperations();
		do{
			System.out.println("Enter Choice: \n1:Compare Strings\n2:Reverse String\n3:Convert characters to Lower or Upper Case\n4:Find Largest Word");
			choice=sc.nextInt();
			if(choice==1){
				strValue1=s.stringGet("first");
				strValue1=s.stringGet("second");
				System.out.println(s.stringCompare(strValue1, strValue2));
			}
			
			else if(choice==2){
				strValue1=s.stringGet("");
				System.out.println(s.stringReverse(strValue1));
			}
			
			else if(choice==3){
				strValue1=s.stringGet("");
				System.out.println(s.lowerUpper(strValue1));
			}
			
			else if(choice==4){
				strValue1=s.stringGet("");
				System.out.println(s.largestWord(strValue1));
			}
			else if(choice==0)
				System.exit(0);
			else
				System.out.println("Invalid Choice.....!!!!");
		}while(choice!=0);
		sc.close();
		
		}
	

}
