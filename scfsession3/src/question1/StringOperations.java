package question1;

import java.util.Scanner;

public class StringOperations {
	String stringValue;
	
	Scanner sc=new Scanner(System.in);
	/**stringGet is a getter forStringOperations class
	 * @param initials gets initial msg to be displayed
	 * @return string value got from user
	 */
	protected String stringGet(String initials){
		System.out.println("Enter "+initials+" String ");
		stringValue=sc.nextLine();
		
		return stringValue;
	}
	/**
	 * StringComapre compares two string for equality
	 * @param stringValue1 First string
	 * @param stringValue2 Second String
	 * @return 0 if not equal and 1 if equal
	 */
	protected int stringCompare(String stringValue1,String stringValue2){
		int strLength1=0,strLength2=0; 
		strLength1=stringValue1.length();
		strLength2=stringValue2.length();
		if(strLength1!=strLength2){
			return 0;
		}else{
			for(int i=0;i<strLength1;i++){
				if(stringValue1.charAt(i)!=stringValue2.charAt(i)){
					return 0;
				}
			}
		}
			
		return 1;
	}
	/**
	 * stringReverse reverse the string
	 * @param stringValue initial string
	 * @return reversed string
	 */
	protected String stringReverse(String stringValue){
		StringBuffer value=new StringBuffer();
		int strLength=stringValue.length();
		for(int i=strLength-1;i>=0;i--)
			value.append(stringValue.charAt(i));
		
		return value.toString();
	}
	/**
	 * lowerUpper interchanges characters from lower case toupper case 
	 * @param stringValue initial string value
	 * @return changed string
	 */
	protected String lowerUpper(String stringValue){
		StringBuffer value=new StringBuffer();
		int strLength=stringValue.length();
		int asciiLowerStart=97,asciiUpperStart=65;
		int asciiLowerEnd=122,asciiUpperEnd=90;
		int asciiValue;
		for(int i=0;i<strLength;i++){
			asciiValue=stringValue.charAt(i);
			if(asciiValue>=asciiLowerStart && asciiValue<=asciiLowerEnd){
				asciiValue=(asciiValue-asciiLowerStart)+asciiUpperStart;
				value.append((char)asciiValue);
			}else if(asciiValue>=asciiUpperStart && asciiValue<=asciiUpperEnd){
				asciiValue=(asciiValue-asciiUpperStart)+asciiLowerStart;
				value.append((char)asciiValue);
			}else{
				value.append(stringValue.charAt(i));
			}
		}
		return value.toString();
	}
	
	/**
	 * Find the largest word in a string
	 * @param inputString is the input string
	 * @return largest word present in the input string
	 */
	protected String largestWord(String inputString){
		String largest="",word="";
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)==' '){
				if(largest.length()<=word.length()) {
					largest=word;
				}
				word="";
				continue;
			}
			word+=inputString.charAt(i);
		}
		if(largest.length()<=word.length()) {    //checking if last word is largest
			largest=word;
		}
		return largest;
	}

	 
}
